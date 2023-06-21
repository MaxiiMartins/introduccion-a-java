/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                matriz1[j] = (int) (Math.random() * 10) + 1;
            }
        }

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[j][i] = matriz[i][j];
            }
        }
        // matriz 1
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println(" ");
        }
        // matriz2
        System.out.println("------");
        for (int[] matriz21 : matriz2) {
            for (int j = 0; j < matriz2.length; j++) {
                System.out.print(matriz21[j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
