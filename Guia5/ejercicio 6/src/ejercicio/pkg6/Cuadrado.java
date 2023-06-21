/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

import java.util.Scanner;

/**
 *
 * @author defaultuser0
 */
public class Cuadrado {
    private final int [][] matriz;

    public Cuadrado() {
        this.matriz = new int [3][3];
    }
    public void cargarCuadrado(){
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Ingrese un valor en la posicion " + i + " - " + j);
                 int num = leer.nextInt();
                    if(num < 10 && num > 0){
                        matriz[i][j] = num;
                    }else{
                        j--;
                    }
            }
 
                    
        }
        System.out.println("");
        System.out.println("Matriz cargada");
    }    
    
    public boolean esMagico(){
        int colBase=0;
        int filBase=0;
        int diag=0;
        boolean resultado = true;

        for (int i = 0; i < matriz.length; i++) {
            int col = 0;
            int fil = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == 0){
                colBase += matriz[i][j];
                filBase += matriz[j][i];
                }

                if (i == j) {
                    diag += matriz[i][j];
                }
                
                fil += matriz[j][i];
                col += matriz[i][j];
            }

            if(fil != filBase || col != colBase){
                resultado = false;
                break;
            }    
            
        }
        if(colBase == diag){
            return resultado;
        }else{
            return false;
        }
    }
    
    public void mostrarCuadrado(){
    
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println(" ");
        }
    }

    
}