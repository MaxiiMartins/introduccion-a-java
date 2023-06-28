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
       try {
            int[] array = new int[5];
            int value = array[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se ha producido una excepción: " + e.fillInStackTrace());
        }
    }
    
}
