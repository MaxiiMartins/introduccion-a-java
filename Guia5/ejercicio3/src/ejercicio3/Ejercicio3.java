/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
    int [] vector = new int [50];
        
    for(int i = 0; i < vector.length; i++ ){
        vector[i] = (int) (Math.random()*20)+1; 
    }
    
        System.out.println("Ingrese el numero a buscar");
        int num = leer.nextInt();
        int cont = 0;
        int pos;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] == num){
                cont++;
                System.out.println("Se encontro el num en la posicion "+ i);
            }
        }
        
        if(cont > 0){
            System.out.println("El numero se repite " + cont + " veces");
        }else{
           System.out.println("No se encontro num");

        }
    }
    
}
