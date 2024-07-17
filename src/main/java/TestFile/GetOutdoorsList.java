package TestFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// получение  списка базовых станций OUTDOOR из файла:

public class GetOutdoorsList {
        public static List<String> getOutdoor(){
        List<String> outdoorList = new ArrayList<>(); // список для outdoor базовых
        try(BufferedReader bufferedReaderOutdoor = new BufferedReader(new FileReader(Constants.FILENAME_OUTDOORS))){
            while (bufferedReaderOutdoor.ready()){
                outdoorList.add(bufferedReaderOutdoor.readLine());
            }
        }catch (Exception e){
            throw new MyException("что то не то",e);
        }
        return outdoorList;
    }
}
