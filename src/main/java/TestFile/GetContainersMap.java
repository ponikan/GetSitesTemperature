package TestFile;

import java.util.*;
// allSitesList - outdoorList = containerMap

public class GetContainersMap {
    public static Map<String,Integer> getContainersTemperAllMap(){
        Map<String,Integer> allWorkingSitesTemperMap = GetAllWorkingSitesTemperMap.getSiteTemperAllMap();
        List<String> allSitesList = GetAllWorkingSitesList.getWorkingSites();
        List<String> outdoorList = GetOutdoorsList.getOutdoor();
        allSitesList.removeAll(outdoorList);
        Map<String, Integer> containerMap = new HashMap<>();
        for (String containerSiteName : allSitesList){
            Integer containerSiteDegree = allWorkingSitesTemperMap.get(containerSiteName);
            containerMap.put(containerSiteName,containerSiteDegree);
        }
        return containerMap;
    }
}
