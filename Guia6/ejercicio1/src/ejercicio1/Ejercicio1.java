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
        
        try {
            String string = null;
            System.out.println(string.length());
            
        } catch (NullPointerException e) {
            System.out.println("Se ha producido una excepción:" + e.getMessage());
        }
        
    }
    
}
