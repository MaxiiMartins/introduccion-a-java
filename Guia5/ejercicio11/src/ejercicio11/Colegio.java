/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.*;

/**
 *
 * @author defaultuser0
 */
public class Colegio {

    private Set<Alumno> alumnos;

    public Colegio() {
        this.alumnos = new TreeSet<>();
        System.out.println("Se ha generado un nuevo colegio");
        System.out.println("");

    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void quitarAlumno(int legajo) {
        for (Iterator<Alumno> iterator = alumnos.iterator(); iterator.hasNext();) {
            Alumno next = iterator.next();
            if (next.getLegajo() == legajo) {
                iterator.remove();
            }
        }
    }

    public void listarAlumnos() {
        System.out.println("Lista de alumnos: ");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }
    }

    public void listarAlumnos(char letra) {
        System.out.println("Alumnos cuyo Apellido comiencen en " + letra);
        for (Alumno alumno : alumnos) {
            if (alumno.getApellido().toLowerCase().charAt(0) == letra) {
                System.out.println(alumno);
            }
        }
    }
}
