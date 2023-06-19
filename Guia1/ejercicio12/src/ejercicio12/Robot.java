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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Robot {

    private int bateria = 500;
    private String nombre;

    public Robot(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void avanzar(int pasos) {
        int consumo = pasos / 100 * 10;

        if (bateria >= consumo) {
            bateria -= consumo;
            System.out.println(nombre + " avanzó " + pasos + " pasos. Batería restante: " + bateria);
        } else {
            System.out.println(nombre + " no tiene suficiente batería para avanzar " + pasos + " pasos.");
        }
    }

    public Boolean bateriaVacia() {
        return bateria <= 0;
    }
}
