package TestFile;

import java.util.ArrayList;
import java.util.List;

// получение из общего списка строк только тех, где указана температура:

public class DegreesList {
    public static List<Integer> getDegrees(){
        List<Integer> degrees = new ArrayList<>();
        List<String> allStringsFromMMlFile = ReadAllStringsFromMMLFile.getAllStrings();
        for (String str: allStringsFromMMlFile){
            if (str.startsWith("Temperature")){
                degrees.add(Integer.parseInt(str.substring(32)));
            }
        }
        return degrees;
    }
}
