/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dolares = 500;
        double pesos = Conversor.convertirAPesos(dolares);
        System.out.println("$" + dolares + " dólares equivalen a $" + pesos + " pesos argentinos.");

        double pesosArgentinos = 240000;
        double dolaresConvertidos = Conversor.convertirADolares(pesosArgentinos);
        System.out.println("$" + pesosArgentinos + " pesos argentinos equivalen a $" + dolaresConvertidos + " dólares.");
    }

}
