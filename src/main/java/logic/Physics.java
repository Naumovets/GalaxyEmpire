package logic;

public class Physics {
    // сила всемирного тяготения
    public static double F(double m1, double m2, double d ){
        final double G = 6.67*Math.pow(10,-11);
        return (G*m1*m2)/Math.pow(d,2);
    }
}
