package TestFile;

// получаем мапу outdoor с температурой выше 60:

import java.util.*;

// Получение мапы перегретых свыше 60 град аутдоров

public class GetOutdoorsHotMap {

   public static Map<String,Integer> getOutdoorHotMap(){

       Map<String,Integer> hotOutdoorMap = new HashMap<>();
       Map<String,Integer> siteTemperAllMap = GetAllWorkingSitesMap.getSiteTemperAllMap();
       List<String> outdoorList = GetOutdoorsList.getOutdoor();

       for (Iterator<String> iterator = siteTemperAllMap.keySet().iterator(); iterator.hasNext(); ){
           String bsName = iterator.next();
           Integer siteTemperature = siteTemperAllMap.get(bsName);
           if (outdoorList.contains(bsName) && siteTemperature > Constants.TRESHOLD_OUTDOOR_TEMPERATURE){
               hotOutdoorMap.put(bsName, siteTemperature); // кладем в мапу перегретых аутдоров пару сайт - градус

           }
       }
       return hotOutdoorMap;
   }
}
