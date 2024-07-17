package TestFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WrightAllWorkingSitesFile {
    public static void wrightAllWorkingSitesFile(){
        try(BufferedWriter bufferedWriterAllWorkingSites = new BufferedWriter(new FileWriter(Constants.FILENAME_OUT))){
           Map<String,Integer> siteTemperAllMap = GetAllWorkingSitesMap.getSiteTemperAllMap();
            for (Map.Entry<String, Integer> entry : siteTemperAllMap.entrySet()){
                bufferedWriterAllWorkingSites.write(entry.getKey() + " : "+ entry.getValue() + "\n");
            }
        } catch (IOException e) {
            throw new MyException("что то не то", e);
        }
    }
}
