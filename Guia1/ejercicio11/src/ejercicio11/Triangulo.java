/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author defaultuser0
 */
class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo() {
    }

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }
    
    public boolean esUnTriangulo() {
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    public String tipoTriangulo() {
        if (!esUnTriangulo()) {
            return "Con sus lados no se puede representar un triángulo!!!";
        } else if (lado1 == lado2 && lado2 == lado3) {
            return "Equilátero";
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
}
