/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3, 3, 3);

        // Mostrar por consola qué tipo de triángulo es
        System.out.println("El triángulo 1 es: " + triangulo1.tipoTriangulo());

        // Crear un objeto Triángulo inválido
        Triangulo triangulo2 = new Triangulo(1, 2, 6);

        // Mostrar por consola qué tipo de triángulo es
        System.out.println("El triángulo 2 es: " + triangulo2.tipoTriangulo());
    }

}
