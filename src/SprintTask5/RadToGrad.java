package SprintTask5;

public class RadToGrad {

    public static void main(String[] args) {
        double pi = 3.14;
        double radian = 1.57;
        double resultRadian = calGrads(pi, radian);

        System.out.println(  radian + " radians is " + resultRadian + " grads ");
    }
    private static double calGrads(double pi, double radian) {
        return ( radian * 180) / pi;
    }
}
