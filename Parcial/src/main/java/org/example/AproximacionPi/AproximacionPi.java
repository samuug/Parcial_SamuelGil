package org.example.AproximacionPi;

public class AproximacionPi {
    //Obtención de una aproximación al
    //número pi mediante el método MonteCarlo
    public static void generarNumeroPi(long pasos) {
        int nCirculo = 0;
        for (int i = 0; i < pasos; i++) {
            double x = Math.random();
            double y = Math.random();
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                nCirculo++;
            }
        }
        double pi = 4 * (double) nCirculo / pasos;
        System.out.println("El valor de pi es: " + pi);
    }
}
