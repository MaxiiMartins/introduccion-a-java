/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pensador pensador = new Pensador(3915);

        // Probar todos los métodos y mostrar los resultados por consola
        int valorInvertido = pensador.invertir();
        System.out.println("Valor invertido: " + valorInvertido);

        int parAnterior = pensador.parAntes();
        System.out.println("Par anterior: " + parAnterior);

        int parPosterior = pensador.parPosterior();
        System.out.println("Par posterior: " + parPosterior);

        int primerDigito = pensador.primerDigito();
        System.out.println("Primer dígito: " + primerDigito);

        int ultimoDigito = pensador.ultimoDigito();
        System.out.println("Último dígito: " + ultimoDigito);
    }
    
}
