
package principal;

import servicio.PaisServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    public static void main(String[] args) {
        PaisServicio pS = new PaisServicio();
        pS.gurdarPais();
        pS.mostrarPaises();
        pS.ordenarAlfabeticamente();
        pS.eliminarPais();
        pS.mostrarPaises();
    }   
}
