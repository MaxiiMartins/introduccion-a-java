/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.List;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Directorio directorio = new Directorio();

        // Agregar clientes al directorio
        Cliente cliente1 = new Cliente("11111111", "Juan", "Pérez", "Buenos Aires", "Calle 123");
        directorio.agregarCliente(123456789, cliente1);

        Cliente cliente2 = new Cliente("22222222", "María", "González", "Buenos Aires", "Calle 456");
        directorio.agregarCliente(987654321, cliente2);

        Cliente cliente3 = new Cliente("33333333", "Carlos", "López", "Córdoba", "Avenida X");
        directorio.agregarCliente(111111111, cliente3);

        Cliente cliente4 = new Cliente("44444444", "Laura", "Rodríguez", "Córdoba", "Avenida Y");
        directorio.agregarCliente(222222222, cliente4);

        Cliente cliente5 = new Cliente("55555555", "Pedro", "Fernández", "Buenos Aires", "Calle 789");
        directorio.agregarCliente(333333333, cliente5);

        // Buscar cliente por número de teléfono
        Cliente clienteEncontrado = directorio.buscarCliente(123456789);
        System.out.println("Cliente encontrado: " + clienteEncontrado.getNombre() + " " + clienteEncontrado.getApellido());

        // Buscar teléfonos por apellido
        List<Integer> telefonosPorApellido = directorio.buscarTelefono("González");
        System.out.println("Teléfonos asociados al apellido González:");
        for (int telefono : telefonosPorApellido) {
            System.out.println(telefono);
        }

        // Buscar clientes por ciudad
        List<Cliente> clientesPorCiudad = directorio.buscarClientes("Córdoba");
        System.out.println("Clientes asociados a la ciudad de Córdoba:");
        for (Cliente cliente : clientesPorCiudad) {
            System.out.println(cliente.getNombre() + " " + cliente.getApellido());
        }

        // Borrar un cliente
        directorio.borrarCliente(987654321);
    }

}
