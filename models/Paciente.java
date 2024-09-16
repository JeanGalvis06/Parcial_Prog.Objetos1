package models;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String direccion;
    private String telefono;
    private String codigoPostal;
    private String nif;
    private String numeroSeguridadSocial;
    private Medico medicoAsignado;
    private List<Cita> citas;

    // Constructor
    public Paciente() {
        this.citas = new ArrayList<>();
    }

    public Paciente(String nombre, String direccion, String telefono, String codigoPostal, String nif,
            String numeroSeguridadSocial, Medico medicoAsignado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.codigoPostal = codigoPostal;
        this.nif = nif;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.medicoAsignado = medicoAsignado;
        this.citas = new ArrayList<>();
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

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", nif='" + nif + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", medicoAsignado=" + (medicoAsignado != null ? medicoAsignado.getNombre() : "Sin medico asignado") +
                ", citas=" + citas +
                '}';
    }

}
