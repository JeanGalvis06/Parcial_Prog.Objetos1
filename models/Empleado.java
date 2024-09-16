package models;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String provincia;
    private String codigoPostal;
    private String nif;
    private String numeroSeguridadSocial;
    private String tipo;
    private List<Vacaciones> vacaciones;

    public Empleado() {
        this.vacaciones = new ArrayList<>();
    }

    public Empleado(String nombre, String direccion, String telefono, String poblacion, String provincia,
            String codigoPostal, String nif, String numeroSeguridadSocial, String tipo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.nif = nif;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.tipo = tipo;
        this.vacaciones = new ArrayList<>();
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

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Vacaciones> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacaciones> vacaciones) {
        this.vacaciones = vacaciones;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", nif='" + nif + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", tipo='" + tipo + '\'' +
                ", vacaciones=" + vacaciones +
                '}';
    }

}
