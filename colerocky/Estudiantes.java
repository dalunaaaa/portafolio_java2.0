package colerocky;

public class Estudiantes{
    private String nombre;
    private String correo;
    private String carrera;
    private int edad;
    private boolean solvencia;

    public Estudiantes(String nombre, String correo, String carrera, int edad, boolean solvencia) {
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.edad = edad;
        this.solvencia = solvencia;
    }

    //getters
    public String getNombre() {
        return nombre;

    }
    public String getCorreo(){
        return correo;
    }
    public String getCarrera(){
        return carrera;
    }
    public int getEdad(){
        return edad;
    }
    public boolean isSolvencia(){
        return solvencia;
    }

}
