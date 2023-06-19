/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Informar por consola si un número escogido es primo o no
        int numero = 17;
        int numero2 = -90;

        boolean esPrimo = Calculo.esPrimo(numero);
        System.out.println("¿El número " + numero + " es primo? " + esPrimo);

        // Mostrar por consola el valor absoluto de -90
        int valorAbsoluto = Calculo.valorAbsoluto(numero2);
        System.out.println("El valor absoluto de " + numero2 + " es " + valorAbsoluto);

        // Mostrar las raíces de la ecuación de segundo grado con los coeficientes: 1, 0 y 9
        Calculo.calcularRaices(1, 0, 9);
    }

}
