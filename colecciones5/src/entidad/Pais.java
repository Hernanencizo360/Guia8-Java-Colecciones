package entidad;

import java.util.Objects;

/**
 *
 * @author Hernan
 */
public class Pais implements Comparable<Pais>{

    private String nombre;

    public Pais() {

    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Pais t) {
        return this.nombre.compareToIgnoreCase(t.getNombre());
    }

    
}
