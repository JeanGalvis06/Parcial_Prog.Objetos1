package models;

public class Sintoma {
    private String descripcion;

    // Constructor
    public Sintoma() {

    }

    public Sintoma(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Sintoma{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
}