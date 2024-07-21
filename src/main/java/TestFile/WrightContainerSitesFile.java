package TestFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WrightContainerSitesFile {
    public static void wrightContainerSitesFile(){
        try(BufferedWriter bufferedWriterContainerSites = new BufferedWriter(new FileWriter(Constants.FILENAME_TEMPER_CONTAINERS))){
           Map<String,Integer> containerMap = GetContainersMap.getContainersTemperAllMap();
            for (Map.Entry<String, Integer> entry : containerMap.entrySet()){
                bufferedWriterContainerSites.write(entry.getKey() + " : "+ entry.getValue() + "\n");
            }
        } catch (IOException e) {
            throw new MyException("что то не то", e);
        }
    }
}
