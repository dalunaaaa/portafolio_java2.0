package matematicas;
import opciones.ListaOpciones;
import java.util.Scanner;

public class mate {
    //lista opciones mate
    public static String[] opciones = {"Sumar","Restar","Dividir","Multiplicar"};
    public static double sumar(double a,double b){ return a+b; }
    public static double restar(double a,double b){ return a-b; }
    public static double dividir(double a,double b){ return a/b; }
    public static double multiplicar(double a,double b){ return a*b; }


// programa mate
    public static void programa(){

        ListaOpciones.cargarOpciones(mate.opciones);

        Scanner intoDocu = new Scanner(System.in);
        System.out.print("[?]: ");
        int docu = intoDocu.nextInt();

        System.out.println();
        System.out.print("num1: ");
        double num1 = intoDocu.nextInt();
        System.out.print("num2: ");
        double num2 = intoDocu.nextDouble();

        double i = 0;

        switch (docu){
            case 1:
                i = sumar(num1,num2);
                break;
            case 2:
                i = restar(num1,num2);
                break;
            case 3:
                i = dividir(num1,num2);
                break;
            case 4:
                i = multiplicar(num1,num2);
                break;
        }
        System.out.println("Result: "+ i+ "\n");


        System.out.println("----------------------------------------------");
    }

}
