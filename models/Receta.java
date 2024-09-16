package models;

import java.util.Date;

public class Receta {
    private Date fechaInicio;
    private Date fechaFin;


    // Constructor
    public Receta() {

    }

    public Receta(Date fechaInicio, Date fechaFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }


    @Override
    public String toString() {
        return "Receta{" +
                "fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}';
    }
}