import java.util.HashSet;
import java.util.Scanner;


public class Text {
    private HashSet<Libro> conjuntoLibros;

    public Text() {
        conjuntoLibros = new HashSet<>();
    }

    public void agregarLibro(Libro libro) {
        conjuntoLibros.add(libro);
    }

    public boolean prestamo(String titulo) {
        for (Libro libro : conjuntoLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getEjemplaresDisponibles() > 0) {
                    libro.incrementarEjemplaresPrestados();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public boolean devolucion(String titulo) {
        for (Libro libro : conjuntoLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                if (libro.getEjemplaresPrestados() > 0) {
                    libro.decrementarEjemplaresPrestados();
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Libro libro : conjuntoLibros) {
            sb.append(libro.toString()).append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Text libreria = new Text();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Ingrese el título del libro:");
            String titulo = scanner.nextLine();
            System.out.println("Ingrese el autor del libro:");
            String autor = scanner.nextLine();
            System.out.println("Ingrese el número de ejemplares:");
            int ejemplares = Integer.parseInt(scanner.nextLine());

            Libro libro = new Libro(titulo, autor, ejemplares);
            libreria.agregarLibro(libro);

            System.out.println("¿Desea ingresar otro libro? (s/n)");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        System.out.println("Libros en la librería:");
        System.out.println(libreria.toString());

        System.out.println("Ingrese el título del libro que desea prestar:");
        String tituloPrestamo = scanner.nextLine();
        boolean prestamoExitoso = libreria.prestamo(tituloPrestamo);
        if (prestamoExitoso) {
            System.out.println("Se realizó el préstamo correctamente.");
        } else {
            System.out.println("No se pudo realizar el préstamo. No hay ejemplares disponibles.");
        }

        System.out.println("Ingrese el título del libro que desea devolver:");
        String tituloDevolucion = scanner.nextLine();
        boolean devolucionExitosa = libreria.devolucion(tituloDevolucion);
        if (devolucionExitosa) {
            System.out.println("Se realizó la devolución correctamente.");
        } else {
            System.out.println("No se pudo realizar la devolución. No hay ejemplares prestados.");
        }
    }
}

