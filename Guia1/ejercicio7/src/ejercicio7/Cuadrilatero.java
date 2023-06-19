/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7;

/**
 *
 * @author defaultuser0
 */
public class Cuadrilatero {

    private double largo;
    private double alto;

    public Cuadrilatero() {
    }

    public Cuadrilatero(double largo, double alto) {
        this.largo = largo;
        this.alto = alto;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getAlto() {
        return this.alto;
    }

    public double calcularPerimetro() {
        return 2 * (largo + alto);
    }

    public double calcularArea() {
        return largo * alto;
    }

    public boolean esUnCuadrado() {
        return largo == alto;
    }
}
