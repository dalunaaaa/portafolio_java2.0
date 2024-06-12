import java.util.Scanner;
import conversor.ConversorMonedas;
import mis_metodos.ListaOpciones;
import interfaz_grafica.Banner;
import calculadora.Mate;
import IMC.IMC;
import conversor.ConversionesGrados;
import conversor.Medidas;
import lista.ListaDeCompras;



public class Main {
    public static void main(String[] args) {


        // Lista de opciones
        String[] listaOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "medidas",
                "Grados", "Lista de Compras",
                "conversor moneda", "Opción_8",
                "Opción_9", "Salir" };

        boolean programas = true;

        Scanner intOpcion = new Scanner(System.in);

        do {
            Banner.msj();

            ListaOpciones.cargarOpciones(listaOpciones);

            System.out.print("[?]: ");
            int opcion = intOpcion.nextInt();
            System.out.println("----------------------------------------------");

            // Opciones
            switch (opcion) {
                case 1:
                    Mate.programa();
                    break;
                case 2:
                   IMC.programaIMC();
                    break;
                case 3:
                ConversionesGrados.ejecutar();
                    break;
                case 4:
                    Medidas.mds();
                    break;
                case 5:
                    // Lógica para la opción 5
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    ConversorMonedas.programa();
                case 10:
                    programas = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (programas);

        intOpcion.close();
    }
}
