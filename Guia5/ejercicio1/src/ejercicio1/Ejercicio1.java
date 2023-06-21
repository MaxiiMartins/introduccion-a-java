/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] arreglo= {1,2,3,4};
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}};
        
         Arreglo.sumarLista(arreglo);
         System.out.println(Arreglo.buscarMayor(matriz));
          System.out.println(Arreglo.cuentaVocales("aeiou"));
         System.out.println(Arreglo.cuentaCaracter("aeioueaea",'e'));
    }
    
}
