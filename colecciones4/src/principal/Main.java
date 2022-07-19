
package principal;

import servicio.PeliculaServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        PeliculaServicio pS = new PeliculaServicio();
        pS.crearPelicula();
        pS.peliculasLista();
        pS.duracionMayor();
        pS.ordenarDeMayor();
        pS.ordenarDeMenor();
        pS.ordenarPorTitulo();
        pS.ordenarPorDirector();
        /*
        Scarface - Howart Hugues - 2,50
        El padrino - Francis Ford Coppola - 1,05
        Interestelar - Christopher Nolan - 1
        Psicosis - Alfred Hitchcock - 2,49
        El Origen - Christopher Nolan - 0,59
        */
              
        
    }
}
