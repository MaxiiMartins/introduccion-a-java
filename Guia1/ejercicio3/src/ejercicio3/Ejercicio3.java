/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador = new Jugador();

        // Establecer los atributos del jugador
        jugador.setNombre("Juan");
        jugador.setPuntaje(140);
        jugador.setNacionalidad("Argentino");
        jugador.setEdad(29);

        // Mostrar el estado de los atributos por consola
        System.out.println("Jugador");
        System.out.println("* Nombre: " + jugador.getNombre());
        System.out.println("* Puntos: " + jugador.getPuntaje());
        System.out.println("* Nacionalidad: " + jugador.getNacionalidad());
        System.out.println("* Edad: " + jugador.getEdad());
    }
    
}
