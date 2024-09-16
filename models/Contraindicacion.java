package models;

public class Contraindicacion {
    private String descripcion;

    // Constructor

    public Contraindicacion() {

    }

    public Contraindicacion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Getters and Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Contraindicacion{" +
                "descripcion='" + descripcion + '\'' +
                '}';
    }
    

}
