package TestFile;

// если списки работающих БС и списки с температурой одинаковы по длине тогда все ок
// и можно положить в мапу:

import java.util.List;

public class ValidateAllBsList {
        public static boolean validate(){
            List<String> siteNameList = GetAllWorkingSitesList.getWorkingSites();
            List<Integer> degreesList = DegreesList.getDegrees();
             if (siteNameList.size() == degreesList.size()){
                 return true;
        } else return false;
    }
}
