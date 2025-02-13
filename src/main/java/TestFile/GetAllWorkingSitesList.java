package TestFile;

import java.util.ArrayList;
import java.util.List;

// Чтение строк с успешными MML командами из файла MML

public class GetAllWorkingSitesList {

    public static List<String> getWorkingSites() {
        List<String> siteNameList = new ArrayList<>();
        List<String> allStrings = ReadAllStringsFromMMLFile.getAllStrings();
        for (int i = 0; i < allStrings.size(); i++) {
            if (allStrings.get(i).startsWith("NE : ") && allStrings.get(i+4).startsWith("RETCODE = 0  Operation succeeded.")){
                siteNameList.add(allStrings.get(i).substring(5));
            }
        }
        return siteNameList;
    }
}
