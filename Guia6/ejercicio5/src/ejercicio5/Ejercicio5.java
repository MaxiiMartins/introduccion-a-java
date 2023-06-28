/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroRandom = (int) (Math.random() * 500) + 1;
        int intentos = 0;
        boolean adivino = false;

        Scanner scanner = new Scanner(System.in);

        while (!adivino) {
            try {

                System.out.print("Ingrese un numero: ");
                int num = Integer.valueOf(scanner.nextLine());
                intentos++;
                if (num == numeroRandom) {
                    adivino = true;
                    System.out.println("¡Felicidades! Ha adivinado el número " + numeroRandom);
                    System.out.println("Número de intentos: " + intentos);
                } else if (num < numeroRandom) {
                    System.out.println("El número a adivinar es mayor que " + num);
                } else {
                    System.out.println("El número a adivinar es menor que " + num);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: ¡Debe ingresar un número!");
                intentos++;
            }
        }
    }

}
