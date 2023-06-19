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
        // TODO code application logic here
        Pieza pieza = new Pieza();
        Pieza pieza2 = new Pieza("Rey","Blanco",3,0);

        // Establecer los atributos de la pieza
        pieza.setTipo("Reina");
        pieza.setColor("Blanco");
        pieza.setPosicionX(4);
        pieza.setPosicionY(0);
        
        pieza.mostrarInfo();
        pieza2.mostrarInfo();
    }
    
}
