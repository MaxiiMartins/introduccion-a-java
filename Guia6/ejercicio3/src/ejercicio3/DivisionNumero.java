/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author defaultuser0
 */
public class DivisionNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1 = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2 = scanner.nextLine();

        int num1 = Integer.parseInt(numero1);
        int num2 = Integer.parseInt(numero2);

        double resultado = (double)num1 / num2;
        System.out.println("El resultado de la división es: " + resultado);

    }
}
