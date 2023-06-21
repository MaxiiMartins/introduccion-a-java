/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) ((Math.random() * 100) + 1);
        }
        //imprimir vector
        for (int i : vector) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }

}
