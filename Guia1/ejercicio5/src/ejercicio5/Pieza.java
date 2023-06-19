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
public class Pieza {

    private String tipo;
    private String color;
    private int posicionX;
    private int posicionY;

    public Pieza() {
    }

    public Pieza(String tipo, String color, int posicionX, int posicionY) {
        this.tipo = tipo;
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public void mostrarInfo() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Posición X: " + posicionX);
        System.out.println("Posición Y: " + posicionY);
        System.out.println("");
    }
}
