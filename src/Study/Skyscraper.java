package Study;

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final String SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = "Небоскреб построен. Количество этажей - ";
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";

    //напишите тут ваш код
    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILD);
    }
    public Skyscraper(int towers) {
        System.out.println(SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + towers);
    }
    public Skyscraper(String skyline) {
        System.out.println(SKYSCRAPER_WAS_BUILD_DEVELOPER + skyline);
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("JavaRushDevelopment");
    }
}
