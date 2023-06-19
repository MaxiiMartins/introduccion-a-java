/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Computadora miComputadora = new Computadora("Lenovo", "b50-70", 4, 920);
        System.out.println("Mi computadora");
        System.out.println("Marca: " + miComputadora.getMarca());
        System.out.println("Modelo: " + miComputadora.getModelo());
        System.out.println("Capacidad RAM: " + miComputadora.getRam() + " GB");
        System.out.println("Capacidad de Almacenamiento: " + miComputadora.getAlmacenamiento() + " GB");
    }
    
}
