/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Colegio colegio = new Colegio();
        int legajos = 0;
        System.out.println("Quieres generar Alumno ? (s/n)");
        String respuesta = scanner.nextLine();
        while (respuesta.equalsIgnoreCase("s")) {
            legajos++;
            System.out.println("Ingrese el nombre del alumno: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el apellido del alumno: ");
            String apellido = scanner.nextLine();
            System.out.println("Ingrese el año que se encuentra el alumno: ");
            int anio = scanner.nextInt();
            scanner.nextLine();

            Alumno alumno = new Alumno(legajos, apellido, nombre, anio);
            colegio.agregarAlumno(alumno);
            System.out.println("Alumno cargado correctamente");
            System.out.println("");

            System.out.println("Quieres generar otro Alumno ? (s/n)");
            respuesta = scanner.nextLine();
        }

        System.out.println("");
        System.out.println("Quieres listar Alumno a partir de una letra ? (s/n)");
        respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("");
            System.out.println("Ingrese la letra para listar");
            respuesta = scanner.nextLine();
            colegio.listarAlumnos(respuesta.charAt(0));
        } else {
            colegio.listarAlumnos();
        }

    }

}
