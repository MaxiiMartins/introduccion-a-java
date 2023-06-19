/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrilatero cuadrilatero = new Cuadrilatero(70, 50);

        System.out.println("Perímetro: " + cuadrilatero.calcularPerimetro());

        System.out.println("Superficie: " + cuadrilatero.calcularArea());

        if (cuadrilatero.esUnCuadrado()) {
            System.out.println("Es un cuadrado");
        } else {
            System.out.println("No es un cuadrado");
        }

        // Cambiar el estado de uno de sus atributos para que sea un cuadrado
        cuadrilatero.setLargo(50);

        // Mostrar por consola si es un cuadrado o no después del cambio
        if (cuadrilatero.esUnCuadrado()) {
            System.out.println("Ahora es un cuadrado");
        } else {
            System.out.println("Sigue sin ser un cuadrado");
        }
    }

}
