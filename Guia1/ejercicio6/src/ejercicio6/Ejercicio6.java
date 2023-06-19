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
        Numero numero = new Numero(1459);
        if (numero.esPar()) {
            System.out.println("Es par");
        } else {
            System.out.println("No es par");
        }

        if (numero.esPositivo()) {
            System.out.println("Es positivo");
        } else {
            System.out.println("No es positivo");
        }

        if (numero.esMultiploDe(3)) {
            System.out.println("Es múltiplo de 3");
        } else {
            System.out.println("No es múltiplo de 3");
        }
    }

}
