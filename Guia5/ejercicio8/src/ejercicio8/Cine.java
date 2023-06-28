/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

import java.util.*;


/**
 *
 * @author defaultuser0
 */
public class Cine {

    private String nombre;
    private String ubicacion;
    private List<Pelicula> peliculas;

    public Cine(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.peliculas = new ArrayList<>();
    }

    public Cine() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }
    
    

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public void listarPeliculasDuracionMayorA(int duracionMinima) {
        System.out.println("Películas con duración mayor a " + duracionMinima + " horas:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > duracionMinima) {
                System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
            }
        }
    }

    public void listarTodasPeliculas() {
        System.out.println("Lista de todas las películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void listarPeliculasPorTitulo() {
        System.out.println("Películas ordenadas por título:");
        Collections.sort(peliculas, (p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void listarPeliculasPorDirector() {
        System.out.println("Películas ordenadas por director:");
        Collections.sort(peliculas, (p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void listarPeliculasPorDuracion() {
        System.out.println("Películas ordenadas por duración:");
        Collections.sort(peliculas, (p1, p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }
}

