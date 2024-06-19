package colerocky;

public class Cursos {
    private String nombre;
    private String categoria;
    private String periodo;

    Cursos (String nombre, String categoria,String periodo){
        this.nombre = nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    public String getNombre() {
        return nombre;

    }
    public String getCategoria(){
        return categoria;
    }
    public String getPeriodo(){
        return periodo;
    }
}
