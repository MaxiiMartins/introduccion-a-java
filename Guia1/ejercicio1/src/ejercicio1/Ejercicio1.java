/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author defaultuser0
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto producto = new Producto(123,3,"azucar",250.00);
        System.out.println("Producto");
        System.out.println("codigo: " + producto.getCodigo());
        System.out.println("stock: " + producto.getStock());
        System.out.println("descripcion: " + producto.getDescripcion());
        System.out.println("precio: " + producto.getPrecio());
    }
    
}
