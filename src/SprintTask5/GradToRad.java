package SprintTask5;

public class GradToRad {

    public static void main(String[] args) {
        double pi = 3.14;
        double grads = 90;
        double resultGrads = calRadian(pi, grads);

        System.out.println(  grads + " grads is " + resultGrads + " radians ");
    }
    private static double calRadian(double pi, double grads) {
        return (grads * pi) / 180;
    }
}
