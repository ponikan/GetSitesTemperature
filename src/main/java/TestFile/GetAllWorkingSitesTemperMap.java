package TestFile;

import java.util.*;


public class GetAllWorkingSitesTemperMap {

    public static Map<String,Integer> getSiteTemperAllMap(){

        List<String> siteNameList = GetAllWorkingSitesList.getWorkingSites();
        List<Integer> degrees = DegreesList.getDegrees();
        Map<String, Integer> siteTemperAllMap = new HashMap<>();
        boolean isValid = ValidateAllBsList.validate();
        if (isValid){
           for (int i = 0; i < siteNameList.size(); i++) {
               siteTemperAllMap.put(siteNameList.get(i), degrees.get(i));
           }

        return siteTemperAllMap;

       } else throw new MyException("Количество сайтов не равно количеству значений температуры");
   }
}
