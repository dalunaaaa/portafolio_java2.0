package colerocky;

public class Escuela {
    public static void programa() {
        System.out.println("Estudiantes:");

        // Estudiantes
        Estudiantes E1 = new Estudiantes("juan", "jm@scl.edu.gt", "A", 8, true);
        Estudiantes E2 = new Estudiantes("andrea", "as@scl.edu.gt", "A", 8, true);
        Estudiantes E3 = new Estudiantes("miriam", "md@scl.edu.gt", "A", 8, true);
        Estudiantes E4 = new Estudiantes("Alejandro", "Ac@scl.edu.gt", "A", 8, true);
        Estudiantes E5 = new Estudiantes("mario", "mp@scl.edu.gt", "a", 8, true);

        // Cursos9

        Cursos C1 = new Cursos("matematicas", "ciencias", "1");
        Cursos C2 = new Cursos("musica", "Arte", "2");
        Cursos C3 = new Cursos("ciencias naturales", "ciencia", "3");
        Cursos C4 = new Cursos("Expresion Artistica", "Arte", "4");

        // Imprimir información de los estudiantes
        imprimirEstudiante(E1);
        imprimirEstudiante(E2);
        imprimirEstudiante(E3);
        imprimirEstudiante(E4);
        imprimirEstudiante(E5);

        //imprimir materia
        imprimirCursos(C1);
        imprimirCursos(C2);
        imprimirCursos(C3);
        imprimirCursos(C4);
    }

    public static void imprimirEstudiante(Estudiantes estudiante) {
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Correo: " + estudiante.getCorreo());


        System.out.println();
    }

    public static void imprimirCursos( Cursos Cursos) {

        System.out.println("--------------------------------------------");
        System.out.println("materia:" + Cursos.getNombre());

        System.out.println();
    }

    public static void main(String[] args) {
        programa();
    }
}
