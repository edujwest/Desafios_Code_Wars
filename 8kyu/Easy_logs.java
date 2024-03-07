//Given a logarithm base X and two values A and B, return a sum of logratihms with the base X: logxA + logxB

public class EasyLogs {

    public static double logs(double x, double a, double b) {
        // Calcula o logaritmo de (a * b) na base x
        return Math.log(a * b) / Math.log(x);
    }

}