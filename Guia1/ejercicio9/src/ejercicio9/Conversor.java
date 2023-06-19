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
class Conversor {

    private static final double CAMBIO_DOLAR_PESO = 500;

    public static double convertirAPesos(double dolares) {
        return dolares * CAMBIO_DOLAR_PESO;
    }

    public static double convertirADolares(double pesos) {
        return pesos / CAMBIO_DOLAR_PESO;
    }
}
