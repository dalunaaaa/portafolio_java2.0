import java.awt.*;
import java.util.Scanner;

import colerocky.Escuela;

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
import javax.swing.*;
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
        JFrame miVentana= new JFrame();
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setSize(500, 500);
        miVentana.setBackground(Color.PINK);
        miVentana.setLayout(new BorderLayout());

        // Crear el panel principal con BorderLayout
        JPanel Jpmain = new JPanel(new BorderLayout());
        miVentana.add(Jpmain);

        //TITULO
        JLabel titulo = new JLabel("DM.LUNA ", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setBounds(0,10,500,30);
        titulo.setBackground(Color.PINK);
         Jpmain.add(titulo);

        // Crear el panel para los textos (GridLayout)
        JPanel grid = new JPanel(new GridLayout(3, 2, 5, 5));
        grid.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        grid.setBackground(Color.PINK);

        // Crear y agregar los textos al panel
        for (int i = 1; i <= 6; i++) {
            JLabel opc = new JLabel("1c", SwingConstants.CENTER);
            opc.setFont(new Font("Arial", Font.PLAIN, 14));

            grid.add(opc);
        }
        Jpmain.add(grid, BorderLayout.CENTER);

        // Crear el botón y agregarlo al panel inferior izquierdo
        JButton btn = new JButton("Btn");
        btn.setFont(new Font("Arial", Font.BOLD, 14));
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 200, 10, 10));
        buttonPanel.setBackground(Color.blue);
        // Márgenes
        buttonPanel.add(btn);
        Jpmain.add(buttonPanel, BorderLayout.SOUTH);

        // Hacer visible el marco
        miVentana.setVisible(true);









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
