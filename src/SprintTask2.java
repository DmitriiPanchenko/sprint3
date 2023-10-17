public class SprintTask2 {

    public static void main(String[] args) {
        double wayHours = 14;
        double min = 45;
        double sec = 30;

        double time = calTime(min, sec);
        double wayMiles = calWay(wayHours);
        double speed = calSpeed(wayMiles,time);

        System.out.println("The distance in miles is: " + wayMiles + " m");
        System.out.println("The time in hours is: " + time + " h");
        System.out.println("The average speed in miles per hour is: " + speed + " m/h");

    }

    private static double calTime(double min, double sec) {
        return min/60 + sec/3600;
    }

    private static double calWay(double way) {
        return way/1.6;
    }

    private static double calSpeed(double wayMiles, double time) {
        return wayMiles/time;
    }

}