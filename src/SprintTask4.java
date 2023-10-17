public class SprintTask4 {
    public static void main(String[] args) {

        int totalPopulation2023 = 35234980;

        int birthHuman = 17;
        int deathsHuman = 7;
        int emigrantsHuman = 45;
        int daysInYear = 365;

        int EventsYear = (int) calEventsYear(birthHuman, deathsHuman, emigrantsHuman, daysInYear);

        for (int year = 2024; year < 2029; year++) {
            totalPopulation2023 += EventsYear;
            System.out.println("Population forecast for " + year + ": " + totalPopulation2023);
        }

    }
    // 24 25 26 27 28
    private static double calEventsYear(int birthHuman, int deathsHuman, int emigrantsHuman, int daysInYear) {

         int birthInYear = (daysInYear * 24 * 60 * 60) / birthHuman;
         int deathsInYear = (daysInYear * 24 * 60 * 60) / deathsHuman;
         int emigrantsInYear = (daysInYear * 24 * 60 * 60) / emigrantsHuman;

         return birthInYear - deathsInYear - emigrantsInYear;

         
    }

}
