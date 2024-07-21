package TestFile;

public class Main {

    public static void main(String[] args) {

        WrightAllWorkingSitesFile.wrightAllWorkingSitesFile(); // температура вcех сайтов
        WrightContainerSitesFile.wrightContainerSitesFile(); // температура только контейнеров (без аутдоров)
        WrightOutdoorsHotFile.wrightHotOutdorFile();// температура только перегретых outdoors
        WrightSitesOverTemperFile.wrightContainerSitesFile(); // температура перегретых сайтов (без разделения)


    }
}
