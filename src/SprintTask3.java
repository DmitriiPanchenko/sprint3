public class SprintTask3 {

    public static void main(String[] args) {

        // Enter the temperature in degrees Celsius:
        double celsius = -273.15; // Абсолютний нуль
        double result = celsiusFahrenheit(celsius);

        System.out.println("Temperature in degrees Fahrenheit " + result);

    }

    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
