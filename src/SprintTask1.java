public class SprintTask1 {

    public static void main(String[] args) {
        double radius = 5.5;
        double pi = 3.14159265;

        double perimeter = calPerimeter(radius, pi);
        double area = calArea(radius,pi);

        System.out.println("For circle of radius 5.5 area is " + area + " and perimeter is " + perimeter);

    }

    private static double calPerimeter(double radius, double pi) {
        return 2 * radius * pi;
    }

    private static double calArea(double radius, double pi) {
        return radius * radius * pi;
    }

}
