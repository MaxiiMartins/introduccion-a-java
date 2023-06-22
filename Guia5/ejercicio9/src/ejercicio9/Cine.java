/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.*;

/**
 *
 * @author defaultuser0
 */
public class Cine {

    private String nombre;
    private String ubicacion;
    private Set<Pelicula> peliculas;

    public Cine(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.peliculas = new HashSet<>();
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

    public Set<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Set<Pelicula> peliculas) {
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
        List<Pelicula> listaPeliculas = new ArrayList<>(peliculas);
        Collections.sort(listaPeliculas, (p1, p2) -> p1.getTitulo().compareTo(p2.getTitulo()));
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void listarPeliculasPorDirector() {
        System.out.println("Películas ordenadas por director:");
        List<Pelicula> listaPeliculas = new ArrayList<>(peliculas);
        Collections.sort(listaPeliculas, Comparator.comparing(Pelicula::getDirector));
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }

    public void listarPeliculasPorDuracion() {
        System.out.println("Películas ordenadas por duración:");
        List<Pelicula> listaPeliculas = new ArrayList<>(peliculas);
        Collections.sort(listaPeliculas, (p1, p2) -> Integer.compare(p1.getDuracion(), p2.getDuracion()));
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println("Título: " + pelicula.getTitulo() + ", Director: " + pelicula.getDirector() + ", Duración: " + pelicula.getDuracion() + " horas");
        }
    }
}
