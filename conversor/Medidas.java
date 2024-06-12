package conversor;

import java.util.Scanner;

public class Medidas {
    public static void mds () {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" valor de distancia (colocar junto al valor M o KM ): ");
        double distancia = scanner.nextDouble();

        System.out.print("R: ");
        String dato = scanner.next().toUpperCase();

        if (dato.equals("M")) {
            double kilometros = metrosAKilometros(distancia);
            System.out.println(distancia + " metros son " + kilometros + " kilómetros.");
        } else if (dato.equals("KM")) {
            double metros = kilometrosAMetros(distancia);
            System.out.println(distancia + " kilómetros son " + metros + " metros.");
        } else {
            System.out.println("Unidad no válida.");
        }
        System.out.println("-----------------------------------------");
    }

    private static double metrosAKilometros(double metros) {
        return metros / 1000;
    }

    private static double kilometrosAMetros(double kilometros) {
        return kilometros * 1000;
    }
}
