/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.*;

/**
 *
 * @author defaultuser0
 */
public class Directorio {
    private Map<Integer, Cliente> clientes;

    public Directorio() {
        clientes = new HashMap<>();
    }

    public void agregarCliente(int nroTel, Cliente cliente) {
        clientes.put(nroTel, cliente);
    }

    public Cliente buscarCliente(int nroTel) {
        return clientes.get(nroTel);
    }

    public List<Integer> buscarTelefono(String apellido) {
        List<Integer> telefonos = new ArrayList<>();
        for (Map.Entry<Integer, Cliente> entry : clientes.entrySet()) {
            Cliente cliente = entry.getValue();
            if (cliente.getApellido().equalsIgnoreCase(apellido)) {
                telefonos.add(entry.getKey());
            }
        }
        return telefonos;
    }

    public List<Cliente> buscarClientes(String ciudad) {
        List<Cliente> clientesEnCiudad = new ArrayList<>();
        for (Cliente cliente : clientes.values()) {
            if (cliente.getCiudad().equalsIgnoreCase(ciudad)) {
                clientesEnCiudad.add(cliente);
            }
        }
        return clientesEnCiudad;
    }

    public void borrarCliente(int telefono) {
        clientes.remove(telefono);
    }
}
