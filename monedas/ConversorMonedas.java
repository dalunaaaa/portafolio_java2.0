package monedas;

import opciones.ListaOpciones;

import java.util.Scanner;
public class ConversorMonedas {
    static String[] OpcionesMonedas ={
            "Quetzales / dolares", "Dolares/quetzales","Quetzales / pesos", "Pesos / Quetzales"
    };


    public static void programa(){
        ListaOpciones.cargarOpciones(OpcionesMonedas);
        Scanner scanner = new Scanner(System.in);
        System.out.println("[?]:");
        String rspScanner =scanner.nextLine();

        switch (rspScanner) {
            case "1":
                System.out.println("[Q]:  ");
                double respuestaQ = scanner.nextDouble();
                System.out.println("[$]: " + Q$(respuestaQ));
                break;
            case "2":
                System.out.println("[$]:  ");
                double respuestaD = scanner.nextDouble();
                System.out.println("[Q]: " + $Q(respuestaD));

                break;
            case "3":
                System.out.println("[P]:  ");
                double respuestaQs = scanner.nextDouble();
                System.out.println("[Q]: " + QM(respuestaQs));
                break;
            case "4":
                System.out.println("[Q]:  ");
                double respuestaPq = scanner.nextDouble();
                System.out.println("[P]: " + MQ(respuestaPq));
                break;
        }
    }


    public static double Q$ (double quetzales){
        double dolares = quetzales * (1/7.5);
       return dolares;
     }
    public static double $Q (double dolares){
        double quetzales = dolares * (1/7.76);
        return quetzales;
    }
    public static double QM (double quetzales){
        double pesos = quetzales * (1/7.5);
        return pesos;
    }
    public static double MQ (double pesos){
        double quetzales = pesos * (1/7.5);
        return quetzales;
    }



}






