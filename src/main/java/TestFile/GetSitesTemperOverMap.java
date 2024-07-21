package TestFile;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GetSitesTemperOverMap {

    public static Map<String,Integer> getSiteTemperMap(){

        List<String> siteNameList = GetAllWorkingSitesList.getWorkingSites();
        List<Integer> degrees = DegreesList.getDegrees();
        Map<String, Integer> siteOverTemperMap = new HashMap<>();
        boolean isValid = ValidateAllBsList.validate();
        if (isValid){
           for (int i = 0; i < siteNameList.size(); i++) {
               if (degrees.get(i) > Constants.TRESHOLD_CONTEINER_TEMPERATURE) {
                   siteOverTemperMap.put(siteNameList.get(i), degrees.get(i));
               }
           }
        return siteOverTemperMap;

       } else throw new MyException("Количество сайтов не равно количеству значений температуры");
   }
}
