package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class PaisServicio {

    private HashSet<Pais> paises;
    private Scanner leer;

    public PaisServicio() {
        paises = new HashSet();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public void gurdarPais() {
        String nombre, respuesta;

        do {
            System.out.println("Ingrese el nombre del País:");
            nombre = leer.nextLine();

            Pais ob = new Pais(nombre);
            paises.add(ob);

            System.out.println("Sí desea guardar otro País presione 'S':");
            respuesta = leer.nextLine();
            System.out.println("--------------------------------------------");
        } while (respuesta.equalsIgnoreCase("S"));
    }

    public void mostrarPaises() {
        System.out.println("---------------------||---------------------");
        System.out.println("Paises Almacenados:");
        for (Pais aux : paises) {
            System.out.println(aux);
        }
        System.out.println("--------------------------------------------");
    }
    
    public void ordenarAlfabeticamente(){
        // convertir Lista HashSet en una Lista para poder Ordenarlos. 
        ArrayList<Pais> listaPaises = new ArrayList(paises);
        Collections.sort(listaPaises);
        
        System.out.println("---------------------||---------------------");
        System.out.println("Paises Ordenados Alfabéticamente:");
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
    }
    
    public void eliminarPais(){
        boolean entro = false;
        System.out.println("---------------------||---------------------");
        System.out.println("Ingrese el País que desea eliminar: ");
        String eliminar = leer.nextLine();
        
        for (Iterator<Pais> it = paises.iterator(); it.hasNext();) {
            Pais aux = it.next();
            if(aux.getNombre().equalsIgnoreCase(eliminar)){
                it.remove();
                System.out.println("Eliminación Correcta.");
                entro = true;
            } 
        }
        if(entro == false){
            System.out.println("---------------------||---------------------");
            System.out.println("          Fallo en la eliminación            ");
            System.out.println("El país que desea eliminar no se encuentra");
        }
    }
}
