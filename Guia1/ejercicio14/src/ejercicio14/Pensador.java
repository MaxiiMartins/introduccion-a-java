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
class Pensador {

    private int valor;

    public Pensador() {
    }

    public Pensador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int invertir() {
        int numero = this.valor;
        int resultado = 0;

        while (numero != 0) {
            resultado = resultado * 10 + numero % 10;
            numero /= 10;
        }
        
        return resultado;
    }

    public int parAntes() {
        int resultado = this.valor;
        
        if (resultado % 2 == 0) {
            resultado -= 2;
        } else {
            resultado--;
        }
        
        return resultado;
    }

    public int parPosterior() {
        int resultado = this.valor;
        
        if (resultado % 2 == 0) {
            resultado += 2;
        } else {
            resultado++;
        }
        
        return resultado;
    }

    public int primerDigito() {
        int resultado = this.valor;
        
        while (resultado >= 10) {
            resultado /= 10;
        }
        
        return resultado;
    }

    public int ultimoDigito() {
        return this.valor % 10;
    }
}
