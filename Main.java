import java.util.Scanner;

import colerocky.Escuela;
import colerocky.Estudiantes;
import libreria.Biblioteca;
import mis_metodos.ListaOpciones;
import interfaz_grafica.Banner;
import calculadora.Mate;
import IMC.IMC;
import conversor.Medidas;
import lista.ListaDeCompras;
import mis_metodos.MisMetodos;
import conversor.ConversionesGrados;
import conversor.ConversorMonedas;

public class Main {
    public static void main(String[] args) {

        // Lista de opciones
        String[] listaOpciones = {
                "Calculadora", "IMC",
                "Farenheit / Celsius", "Medidas",
                "Grados", "Lista de Compras",
                "Conversor de moneda", "Libros",
                "clase", "Salir"
        };

        boolean programas = true;

        Scanner intOpcion = new Scanner(System.in);

        do {
            MisMetodos.imprimirLinea();
            MisMetodos.limpiarConsola();
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
                    break;
                case 8:
                    Biblioteca.programa();
                    break;
                case 9:
                    Escuela.programa();
                    break;
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
