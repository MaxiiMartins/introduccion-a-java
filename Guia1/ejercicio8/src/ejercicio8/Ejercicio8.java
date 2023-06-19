/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.75);
        System.out.println("Perímetro: " + circulo.calcularPerimetro());
        System.out.println("Superficie: " + circulo.calcularArea());
    }

}
