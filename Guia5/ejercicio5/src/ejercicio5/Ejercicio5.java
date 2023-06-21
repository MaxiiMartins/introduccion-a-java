/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz2 = new int[3][3];        
        int[][] matriz3 = {{0, -2, 4}, {2, 0, 2}, {-4, -2, 0}};

        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                matriz2[j][i] = matriz3[i][j];
            }
        }
        
        // matriz 1
        for (int[] matriz31 : matriz3) {
            for (int j = 0; j < matriz3.length; j++) {
                System.out.print(matriz31[j] + " ");
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
        boolean antiSimetrica = true;
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2.length; j++) {
                if(matriz2[i][j] != (matriz3[i][j]*-1)){
                    antiSimetrica = false;
                }
            }
        }
        if(antiSimetrica){
            System.out.println("Es anti simetrica");
        }else{
            System.out.println("No es anti simetrica");
        }
    }
    
}
