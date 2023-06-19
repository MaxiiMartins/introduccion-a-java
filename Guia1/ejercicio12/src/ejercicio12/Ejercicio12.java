/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Robot robot = new Robot("Tito");
        while (!robot.bateriaVacia()) {
            robot.avanzar(1000);
        }

    }

}
