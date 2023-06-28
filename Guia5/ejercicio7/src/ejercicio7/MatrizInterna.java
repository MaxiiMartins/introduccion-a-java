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

public class MatrizInterna {


    public static void generarMatriz(int[][]matriz1) {
         int cont = 1;
      
         System.out.println("Generando matriz...");
         System.out.println("");
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = cont;
               
                System.out.print("[" + cont + "] ");
                
                cont++;

            }
            System.out.println(" ");
        }
       
    }

    public static void buscarMatriz(int[][]matriz1, int[][]matriz2) {
  
        boolean bandera = false;
        int ii= 0;
        int jj= 0;
        
        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < 10; j++) {
                
                
               if(matriz1[i][j] == matriz2[0][0]){
                   int coincidencias = 0;
                   bandera = true;
                   ii = i;
                   jj = j;
                   
                    for(int k=0; k<matriz2.length; k++){
                        for(int h=0; h<matriz2.length; h++){
                          coincidencias++;  
                          if(matriz2[k][h] != matriz1[i+k][j+h]) {
                              bandera = false;
                          }
                        }
                    }
                   if(coincidencias == 9){
                       break;
                   }
               }

            }

        }
        
        if(bandera){
            System.out.println("La matriz M se encuentra en los indices " + ii + ", " + jj);
            
        }else{
            System.out.println("No se encontro coincidencia");
        }
    }
}

