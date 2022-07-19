package servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class RazaPerros {
    // variables globales o atributos globales.

    private Scanner leer;
    private ArrayList<String> lista;

    // constructor
    public RazaPerros() {
        this.lista = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearRaza() {
        String raza, opcion;
        boolean salir = true;

        while (salir == true) {
            System.out.println("Ingrese la raza del perro");
            raza = leer.nextLine();
            lista.add(raza);

            System.out.println("Si desea Salir presione 'S'.");
            System.out.println("De lo contrario, presione 'N'");
            opcion = leer.nextLine();
            System.out.println("------------------------------------------");

            if (opcion.equalsIgnoreCase("S")) {
                salir = false;
            }
        }
    }

    public void mostrarRaza() {
        System.out.println("La cantidad de razas guardadas son: " + lista.size());

        System.out.println("Y las razas son: ");
        //for each
        for (String aux : lista) {
            System.out.println(aux);
        }
    }

    public void eliminarRaza() {
        String suprimir;
        boolean resultado = false; 
        
        System.out.println("Ingrese la raza que desea eliminar");
        suprimir = leer.nextLine();
        
        // iterator
        Iterator<String> it = lista.iterator();

        while (it.hasNext()) {
            String aux = it.next();
            
            if(aux.equalsIgnoreCase(suprimir)){
                it.remove();
                System.out.println("Eliminación Satisfactoria");
                resultado = true;
                break;
            } 
        }
        
        if (resultado == false){
            System.out.println("La raza no se encuentra en la lista");
        }
    }
    
    public void listaOrdenada(){
        Collections.sort(lista);
        System.out.println("La lista ordenada es: " + lista);
    }
    
    
}
