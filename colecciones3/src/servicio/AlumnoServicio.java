/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. 
Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Hernan
 */
public class AlumnoServicio {
    //atributos
    private ArrayList<Alumno> alumnos;
    private Scanner leer;

    //espacio en memoria de la LISTA y habilito el flujo de datos
    public AlumnoServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.alumnos = new ArrayList();
    }

    public ArrayList<Alumno> crearAlumno() {
        String respuesta;
        Integer nota1, nota2, nota3;

        do {
            Alumno ob = new Alumno();
            System.out.println("Ingrese su nombre");
            String nombre = leer.nextLine();
            ob.setNombre(nombre);

            System.out.println("Ingrese la primera nota:");
            nota1 = leer.nextInt();
            
            System.out.println("Ingrese la segunda nota:");
            nota2 = leer.nextInt();
            
            System.out.println("Ingrese la tercera nota:");
            nota3 = leer.nextInt();
            
            ob.setNotas(nota1, nota2, nota3);
            alumnos.add(ob);

            leer.nextLine();//limpiar el buffer

            /* 
            mostrar alumno creado.
            for (Alumno aux : alumnos) {
                System.out.println(aux.toString());
            }
             */
            System.out.println("Desea crear otro Alumno? Presione 's'");
            respuesta = leer.nextLine();
            System.out.println("----------------------------------------------------");

        } while (respuesta.equalsIgnoreCase("S"));

        return alumnos;
    }
    
      /*
    Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
    final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
    del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
    promedio final, devuelto por el método y mostrado en el main.
     */
    public double notaFinal(Alumno aux) {
        double acum = 0;
        for (Integer nota : aux.getNotas()) {
            acum = acum + nota;
        }
        double notaFinal = acum / 3;
        return notaFinal;
    }
}
