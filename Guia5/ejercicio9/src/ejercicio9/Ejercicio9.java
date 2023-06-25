package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cine romaSRL = new Cine("Cine ROMA SRL", "Rivadavia 325");

        while (true) {
            System.out.println("Crear una nueva película? (s/n)");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }

            System.out.println("Ingrese el título de la película:");
            String titulo = scanner.nextLine();

            System.out.println("Ingrese el director de la película:");
            String director = scanner.nextLine();

            System.out.println("Ingrese la duración de la película en horas:");
            int duracion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            romaSRL.agregarPelicula(pelicula);
        }
        boolean estaVacio = romaSRL.getPeliculas().isEmpty();
        if (!estaVacio) {
            System.out.println("Ingrese la duración mínima en horas para listar las películas:");
            int duracionMinima = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            romaSRL.listarPeliculasDuracionMayorA(duracionMinima);
            System.out.println("");
            romaSRL.listarTodasPeliculas();
            System.out.println("");
            romaSRL.listarPeliculasPorTitulo();
            System.out.println("");
            romaSRL.listarPeliculasPorDirector();
            System.out.println("");
            romaSRL.listarPeliculasPorDuracion();

        }
    }

}
