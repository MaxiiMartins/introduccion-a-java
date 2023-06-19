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
public class Numero {

    private int num;

    public Numero() {
    }

    public Numero(int num) {
        this.num = num;
    }

    public void setNumero(int value) {
        this.num = value;
    }

    public int getNumero() {
        return num;
    }

    public Boolean esPar() {
        return 0 == num % 2;
    }

    public Boolean esPositivo() {
        return 0 <= num;
    }

    public Boolean esMultiploDe(int value) {
        return this.num % value == 0;
    }
}
