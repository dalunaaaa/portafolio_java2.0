package calculadora;

import java.util.Scanner;

public class CalcularEdad {
    int anno;
    int mes;
    int dia;
    int actualanno;
    int actualmes;
    int actualdia;

    public CalcularEdad(int anno, int mes, int dia, int actualanno, int actualmes, int actualdia) {
        this.anno = anno;
        this.mes = mes;
        this.dia = dia;
        this.actualanno = actualanno;
        this.actualmes = actualmes;
        this.actualdia = actualdia;

    }

    public int calcularEdad() {
        int edad = actualanno - anno;

        // Si aún no ha cumplido años en el año actual
        if (actualmes < mes || (actualmes == mes && actualdia < dia)) {
            edad--;
        }

        return edad;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.print("Año: ");
        int anno = scanner.nextInt();
        System.out.print("Mes: ");
        int mes = scanner.nextInt();
        System.out.print("Día: ");
        int dia = scanner.nextInt();

        // Obtener la fecha actual
        int actualanno = 2024;
        int actualmes = 5;
        int actualdia = 27;

        // Crear instancia de CalcularEdad y calcular la edad
        CalcularEdad calculo = new CalcularEdad(anno, mes, dia, actualanno, actualmes, actualdia);
        int edad = calculo.calcularEdad();

        // Imprimir la edad
        System.out.println("Su edad es: " + edad + " años.");

        // Cerrar el scanner
        scanner.close();
    }
}

