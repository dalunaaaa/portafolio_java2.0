package libreria;

import java.util.Scanner;

public class Biblioteca {
    public static void programa(){
        System.out.println("Bibliteca :");

        Libros libro1 = new Libros("Culpa Mia","Mercedes Ron", "2015");
        Libros libro2 = new Libros("After","Anna Todd", "2013");
        Libros libro3 = new Libros("El chico de al lado", "Kira Cassiopeia", "2014");
        Libros libro4 = new Libros("Atrévete a amarme", "Ariana Godoy", "2015");
        Libros libro5 = new Libros("Mi primer amor falso", "Naya V.","2015");
        Libros libro6 = new Libros("Mi hermanastro", "Daniela Abed", "2016");
        Libros libro7 = new Libros("Cruzando los límites ","María Martínez","2015");
        Libros libro8 = new Libros("Orgullo y prejuicio", "Jane Austen","1813");
        Libros libro9 = new Libros("Marfil"," Mercedes Ron","2017");
        Libros libro10 =new Libros("La chica de los ojos color café"," María Martínez","2015");



        Scanner scr = new Scanner(System.in);


        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());

        //AUTORES biblioteca

        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro3.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //FECHAS
        System.out.println(libro1.getFecha());
        System.out.println(libro2.getFecha());
        System.out.println(libro3.getFecha());
        System.out.println(libro4.getFecha());
        System.out.println(libro5.getFecha());
        System.out.println(libro6.getFecha());
        System.out.println(libro7.getFecha());
        System.out.println(libro8.getFecha());
        System.out.println(libro9.getFecha());
        System.out.println(libro10.getFecha());


        System.out.println(libro1.toString());
    }
}
