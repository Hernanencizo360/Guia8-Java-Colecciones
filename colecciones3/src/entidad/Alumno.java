/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno
 */
package entidad;

import java.util.ArrayList;

/**
 *
 * @author Hernan
 */
public class Alumno {

    private String nombre;
    private ArrayList<Integer> notas;

    public Alumno() {
        this.notas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(Integer n1, Integer n2, Integer n3) {
        notas.add(n1);
        notas.add(n2);
        notas.add(n3);
    }
//    public void agregarNotas(Integer n1,Integer n2,Integer n3 ){
//        notas.add(n1);
//        notas.add(n2);
//        notas.add(n3);
//    }
}
