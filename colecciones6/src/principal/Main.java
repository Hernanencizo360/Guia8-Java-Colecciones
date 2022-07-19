/*
 * Realizar un menú para lograr todas las acciones previamente mencionadas.
 */
package principal;

import entidad.Tienda;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import servicio.TiendaServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Tienda t1 = new Tienda();
        TiendaServicio tS = new TiendaServicio();

        boolean salir = false;
        int opcion;

        JOptionPane.showMessageDialog(null, "Bienvenido a " + t1.toString());
        
        while (!salir) {

            System.out.println("Eliga una opción para continuar: ");
            System.out.println("1.- Introducir un Producto: ");
            System.out.println("2.- Modificar el precio de un Producto: ");
            System.out.println("3.- Eliminar un Producto: ");
            System.out.println("4.- Mostrar el Inventario de Productos: ");
            System.out.println("5.- Salir. ");
            
            // coloco un try cath para asegurarme que (si falla la lectura por ejemplo se ingresa un String) el programa siga ejecutandose y no se detenga.
            try { 
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        tS.introducirProducto();
                        break;
                    case 2:
                        tS.modificarPrecio();
                        break;
                    case 3:
                        tS.eliminarProducto();
                        break;
                    case 4:
                        tS.mostrarProducto();
                        break;
                    case 5:
                        JOptionPane.showMessageDialog(null, "MUCHAS GRACIAS POR UTILIZAR" + "\n" + "           NUESTRA APP    "
                                + "\n" + "       ¡VUELVA PRONTO!     ");
                        salir = true;
                        break;
                    default:
                        System.out.println("-----|Eliga una opción en el rago|-----");
                }

            } catch (InputMismatchException e) {
                System.out.println("-------|DEBES INGRESAR UN NÚMERO|-------");
                leer.next();
            }
        }
    }
}
