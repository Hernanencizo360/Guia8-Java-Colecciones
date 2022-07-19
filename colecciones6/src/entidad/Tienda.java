/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
 */
package entidad;

/**
 *
 * @author Hernan
 */
public class Tienda {

    private String nombre = "TiendaFake";
    private String direccion = "Falsa 123 - Argentina";
    private String telefono = "0800-000-1234";

    // Nota: solo necesito el contructor vacio y el toString.
    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Tienda() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return  nombre + "\n"
                + "Direccion: " + direccion + "\n"
                + "Telefono: " + telefono;
    }

}
