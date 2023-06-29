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
public class Alumno implements Comparable<Alumno> {
    // Alumno son: legajo, apellido, nombre y año
    private int legajo;
    private String apellido;
    private String nombre;
    private int anio;

    public Alumno() {
    }

    public Alumno(int legajo, String apellido, String nombre, int anio) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public String toString(){
        return "Legajo: "+ legajo + " Apellido: " + apellido + " Nombre: " + nombre + " Año: "+ anio;
    }

    @Override
    public int compareTo(Alumno o) {
        return apellido.compareTo(o.getApellido());
    }
    
}
