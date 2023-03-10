import java.util.*;

public class Gravitacija {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v = sc.nextDouble(); // visina

        double a = gravitacija(v);
        izpis(v, a);

        System.out.println("OIS je zakon!");
    }

    public static double gravitacija(double v) {
        double C = Double.parseDouble("6.674E-11");
        double M = Double.parseDouble("5.972E24");
        double r = Double.parseDouble("6.371E6");
        double a = (C*M)/((r+v)*(r+v));

        return a;
    }

    public static void izpis(double v, double a) {
        System.out.println("Nadmorska višina: " + v);
        System.out.println("Gravitacijski pospešek: " + a);
    }

}