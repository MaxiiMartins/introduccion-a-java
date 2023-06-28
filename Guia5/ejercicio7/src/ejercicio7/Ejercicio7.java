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
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = {{1, 2, 3}, {11, 12, 13}, {21, 22, 23}};

        MatrizInterna.generarMatriz(matriz1);
        System.out.println("");
        MatrizInterna.buscarMatriz(matriz1, matriz2);
    }

}
