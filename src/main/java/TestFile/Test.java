package TestFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public static void testFile() {
    List<String> list = GetAllWorkingSitesList.getWorkingSites();
    List<Integer> degr = DegreesList.getDegrees();
    List<String> outdoor = GetOutdoorsList.getOutdoor();

        for (int i = 0; i < outdoor.size(); i++) {
            String str = outdoor.get(i);
            if (!list.contains(str)){
                System.out.println(str);
            }
        }


    try(BufferedWriter writer = new BufferedWriter(new FileWriter(Constants.TEST));) {

        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i)+" : " + degr.get(i) + "\n");
        }
    }catch (Exception e){
        throw new RuntimeException(e);
    }
    }
}
