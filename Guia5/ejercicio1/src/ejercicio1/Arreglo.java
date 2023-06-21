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
public class Arreglo {

    public static void sumarLista(int[] arreglo) {

        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + suma / arreglo.length);
    }

    public static int buscarMayor(int[][] matriz) {
        int intMayor = Integer.MIN_VALUE;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                intMayor = intMayor < matriz[i][j] ? matriz[i][j] : intMayor;
            }
        }

        return intMayor;
    }

    public static int cuentaVocales(String palabra) {

        int cantidadVocales = 0;
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' || palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u') {
                cantidadVocales++;
            }
        }

        return cantidadVocales;
    }

    public static int cuentaCaracter(String palabra, char letra) {

        int totalLetra = 0;

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                totalLetra++;
            }
        }
        return totalLetra;
    }

}
