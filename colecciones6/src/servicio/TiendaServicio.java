/*
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class TiendaServicio {

    private Scanner leer;
    private HashMap<String, Double> inventario;

    public TiendaServicio() {
        this.inventario = new HashMap();
        leer = new Scanner(System.in);
    }

    public void introducirProducto() {
        String nombre;
        Double precio;

        System.out.println("Ingrese el nombre del producto: ");
        nombre = leer.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        precio = leer.nextDouble();
        inventario.put(nombre, precio);
        leer.nextLine();
    }

    public void modificarPrecio() {
        System.out.println("-----------------------------------------------");

        System.out.println("Ingrese el nombre del producto a modificar: ");
        String producto = leer.nextLine();

        //containsKey(Llave)
        //Este método recibe una llave dada por el usuario y revisa si la
        //llave se encuentra en la lista o no. Si la llave se encuentra
        //retorna verdadero y si no falso.
        boolean esta = inventario.containsKey(producto);
        if (esta == true) {
            System.out.println("Ingrese el nuevo valor para el producto " + producto + ": ");
            Double precioNuevo = leer.nextDouble();
            inventario.replace(producto, precioNuevo);
            System.out.println("------|PRODUCTO MODIFICADO EXITOSAMENTE|-------" + "\n");
            leer.nextLine();
        } else {
            System.out.println("El producto no se encuentra en en el Inventario");
            System.out.println("----------|FALLO AL MODIFICAR PRECIO|----------" + "\n");
        }
    }

    public void eliminarProducto() {
        System.out.println("-----------------------------------------------");
        System.out.println("Ingrese el nombre del producto que desea ELIMINAR: ");
        String eliminar = leer.nextLine();

        boolean esta = inventario.containsKey(eliminar);
        if (esta == true) {
            inventario.remove(eliminar);
            System.out.println("-------------|PRODUCTO ELIMINADO|--------------" + "\n");
        } else {
            System.out.println("El producto no se encuentra en en el Inventario");
            System.out.println("----------|FALLO AL ELIMINAR PRODUCTO|---------" + "\n");
        }
    }

    public void mostrarProducto() {
        System.out.println("-------------|PRODUCTO EN LISTAS|--------------");
        for (Map.Entry<String, Double> aux : inventario.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            System.out.println("Producto: "+ key + " - Precio: " + value);
        }
//        System.out.println(inventario);
        System.out.println("-----------------------------------------------");
    }
}
