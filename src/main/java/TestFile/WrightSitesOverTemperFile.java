package TestFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WrightSitesOverTemperFile {
    public static void wrightContainerSitesFile(){
        try(BufferedWriter bufferedWriterSitesOverTemper = new BufferedWriter(new FileWriter(Constants.FILENAME_SITE_OVER_TEMPERATURE))){
           Map<String,Integer> containerMap = GetSitesTemperOverMap.getSiteTemperMap();
            for (Map.Entry<String, Integer> entry : containerMap.entrySet()){
                bufferedWriterSitesOverTemper.write(entry.getKey() + " : "+ entry.getValue() + "\n");
            }
        } catch (IOException e) {
            throw new MyException("что то не то", e);
        }
    }
}
