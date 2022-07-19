/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.AlumnoServicio;

/**
 *
 * @author Hernan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        // instancio un objeto(Servicio)
        AlumnoServicio aS = new AlumnoServicio();
        // llamo a mi metodo crear alumno. (Nota: pido que me devuelva una lista de Alumno.) --> tendre que usar la lista mas adelante.
        ArrayList<Alumno> alumnos = aS.crearAlumno();
        
        
        //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
        //final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método.
        
        String buscarAlumno;
        System.out.println("Ingrese el nombre del alumno para calcular la nota final: ");
        buscarAlumno = leer.nextLine();
        
        // recorro la lista con un for each
        for (Alumno aux : alumnos) { 
             if(aux.getNombre().equalsIgnoreCase(buscarAlumno)){
                // Si está en la lista, se llama al método. Y le envio el alumno;
                 System.out.println("La nota final de " + buscarAlumno + " es: " + aS.notaFinal(aux));
            }
        }
    }
    
}
