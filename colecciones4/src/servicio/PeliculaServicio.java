/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidad.Comparadores;

/**
 *
 * @author Hernan
 */
public class PeliculaServicio {

    // // Creo mi ArrayList y Scanner. para utilizarlas en toda mi clase
    private ArrayList<Pelicula> listaPeliculas;
    private Scanner leer;

    // cuando instancie el objeto servicio en el main se creara espacio en memoria de la LISTA y se habilita el flujo de datos
    public PeliculaServicio() {
        this.listaPeliculas = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    //Metodo para pedir al usuario los DATOS.
    public void crearPelicula() {

        String respuesta;

        do {
            System.out.println("Ingrese el NOMBRE de la película:");
            String nombre = leer.nextLine();

            System.out.println("Ingrese el DIRECTOR de la película: ");
            String director = leer.nextLine();

            System.out.println("Ingrese la DURACIÓN (en horas) de la película.: ");
            Double duracion = leer.nextDouble();

            Pelicula ob = new Pelicula(nombre, director, duracion);
            listaPeliculas.add(ob);
            
            leer.nextLine();

            System.out.println("Sí desea CREAR otra película presione 'S': ");
            respuesta = leer.nextLine();

        } while (respuesta.equalsIgnoreCase("S"));
        
    }

    public void peliculasLista() {
        //Después de ese bucle realizaremos las siguientes acciones:
        //Mostrar en pantalla todas las películas.
        System.out.println("-----------------------------------||-----------------------------------");
        System.out.println("PELÍCULAS EN LISTA: ");
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }

    public void duracionMayor() {
        //Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
        System.out.println("-----------------------------------||-----------------------------------");
        System.out.println("PELÍCULAS CON DURACIÓN MAYOR A 1 HORA: ");
        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion() > 1) {
                System.out.println("+ " + aux.getTitulo());
            }
        }
        System.out.println("-----------------------------------||-----------------------------------");
    }

    public void ordenarDeMayor() {
        //Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
        System.out.println("PELÍCULAS ORDENADAS DE MAYOR A MENOR: ");
        Collections.sort(listaPeliculas, Comparadores.ordenarDuracionMay);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
    
     public void ordenarDeMenor() {
        //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        System.out.println("-----------------------------------||-----------------------------------");
        System.out.println("PELÍCULAS ORDENADAS DE MENOR A MAYOR: ");
        Collections.sort(listaPeliculas, Comparadores.ordenarDuracionMen);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
     
      public void ordenarPorTitulo() {
        //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        System.out.println("-----------------------------------||-----------------------------------");
        System.out.println("PELÍCULAS ORDENADAS ALFABÉTICAMENTE POR TÍTULO: ");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorTitulo);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
      
       public void ordenarPorDirector() {
        //Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
        System.out.println("-----------------------------------||-----------------------------------");
        System.out.println("PELÍCULAS ORDENADAS ALFABÉTICAMENTE POR DIRECTOR: ");
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirector);
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux);
        }
    }
}
