package TestFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WrightOutdoorsHotFile {
    public static void wrightHotOutdorFile(){
        try(BufferedWriter bufferedWriterOutdoorHighTemper = new BufferedWriter(new FileWriter(Constants.FILENAME_HIGH_TEMPER_OUTDOOR))){
           Map<String,Integer> outdoorHotMap = GetOutdoorsHotMap.getOutdoorHotMap();
            for (Map.Entry<String, Integer> entry : outdoorHotMap.entrySet()){
                bufferedWriterOutdoorHighTemper.write(entry.getKey() + " : "+ entry.getValue() + "\n");
            }
        } catch (IOException e) {
            throw new MyException("что то не то", e);
        }
    }
}
