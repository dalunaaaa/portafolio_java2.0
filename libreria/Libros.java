package libreria;

public class Libros {
        private String titulo;
        private String autor;
        private String fecha;

        //metodo Constructor libros

        public Libros(String titulo, String autor, String fecha){
            this.titulo = titulo;
            this.autor = autor;
            this.fecha = fecha;

        }

        //METODOS DE TIPO GET (OBTENER)

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public String getFecha() {
            return fecha;
        }

//METODOS DE TIPO SET (ESTRABLECER)

        public void setTitulo( String autor) {
            this.autor = autor;
        }

        public void setAutor( String autor) {
            this.autor = autor;
        }

        public void setFecha( String fecha) {
            this.fecha = fecha;
        }



        @Override
        public String toString() {
            return "Titulo:" + titulo+ ",Autor: " + autor + "Fecha" + fecha;
        }
    }

