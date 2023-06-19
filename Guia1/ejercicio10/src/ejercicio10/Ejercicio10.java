/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Dibujar un cuadrado de 5 elementos
        Utilitario.dibujaCuadrado(5);

        // Mostrar el mayor entre (20, 75 y 40)
        Utilitario.elMayorEs(20, 75, 40);

        // Mostrar el nombre del día 5
        String nombreDia = Utilitario.elDiaEs(5);
        System.out.println("El nombre del día es: " + nombreDia);
    }
    
}
