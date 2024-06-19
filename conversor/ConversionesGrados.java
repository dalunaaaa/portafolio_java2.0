package conversor;
import java.util.Scanner;

public class ConversionesGrados {
        public static void ejecutar() {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Ingrese temperatura (colocar junto a la temperatura C o F): ");
            double temperatura = scanner.nextDouble();

            String unidato = scanner.next();

            if (unidato.equals("C")) {
                double fahrenheit = celsiusAFahrenheit(temperatura);
                System.out.println(temperatura + " grados Celsius: " + fahrenheit + " grados Fahrenheit.");
            } else if (unidato.equals("F")) {
                double celsius = fahrenheitACelsius(temperatura);
                System.out.println(temperatura + " grados Fahrenheit: " + celsius + " grados Celsius.");
            } else {
                System.out.println("Unidad no válida. Por favor, ingrese 'C' para Celsius o 'F' para Fahrenheit.");
            }

        }

        private static double celsiusAFahrenheit(double celsius) {
            return (celsius * 9/5) + 32;
        }

        private static double fahrenheitACelsius(double fahrenheit) {
            return (fahrenheit - 32) * 5/9;


        }


}



