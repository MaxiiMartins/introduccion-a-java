/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado();
        
        cuadrado.cargarCuadrado();
        //ingresar estos numeros 2 7 6 9 5 1 4 3 8
        
        System.out.println("");
        
        System.out.println("¿Es magica? "+ cuadrado.esMagico());
        
        cuadrado.mostrarCuadrado();
        
    }
    
}
