package models;

import java.util.ArrayList;
import java.util.List;

public class Diagnostico {
    private String nombre;
    private String descripcion;
    private Receta receta;
    private List<Sintoma> sintomas;

    // Constructor
    public Diagnostico() {
        this.sintomas = new ArrayList<>();

    }

    public Diagnostico(String nombre, String descripcion, Receta receta) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.receta = receta;
        this.sintomas = new ArrayList<>();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return "Diagnostico{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", receta=" + (receta != null ? receta.toString() : "Sin receta") +
                '}';
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }

    public void setSintomas(List<Sintoma> sintomas) {
        this.sintomas = sintomas;
    }

}
