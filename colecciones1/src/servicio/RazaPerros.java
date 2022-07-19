package servicio;

import java.util.ArrayList;
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
        this.leer =  new Scanner(System.in).useDelimiter("\n");
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
}
