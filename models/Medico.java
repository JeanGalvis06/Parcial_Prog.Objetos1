package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Medico {
    private String nombre;
    private String direccion;
    private String telefono;
    private String poblacion;
    private String provincia;
    private String codigoPostal;
    private String nif;
    private String numeroSeguridadSocial;
    private String numeroColegiado;
    private String categoriaLaboral;
    private List<String> horarioConsulta;
    private Date fechaAlta;
    private Date fechaBaja;
    private List<Vacaciones> vacaciones;
    private List<Cita> citas;
    private List<Paciente> pacientes;

    // Constructor

    public Medico() {
    }

    public Medico(String nombre, String direccion, String telefono, String poblacion, String provincia,
            String codigoPostal, String nif, String numeroSeguridadSocial, String numeroColegiado,
            String categoriaLaboral, Date fechaAlta, Date fechaBaja) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.codigoPostal = codigoPostal;
        this.nif = nif;
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.numeroColegiado = numeroColegiado;
        this.categoriaLaboral = categoriaLaboral;
        this.horarioConsulta = new ArrayList<>();
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        this.vacaciones = new ArrayList<>();
        this.citas = new ArrayList<>();
        this.pacientes = new ArrayList<>();
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

    public String getNumeroColegiado() {
        return numeroColegiado;
    }

    public void setNumeroColegiado(String numeroColegiado) {
        this.numeroColegiado = numeroColegiado;
    }

    public String getCategoriaLaboral() {
        return categoriaLaboral;
    }

    public void setCategoriaLaboral(String categoriaLaboral) {
        this.categoriaLaboral = categoriaLaboral;
    }

    public List<String> getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(List<String> horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public List<Vacaciones> getVacaciones() {
        return vacaciones;
    }

    public void setVacaciones(List<Vacaciones> vacaciones) {
        this.vacaciones = vacaciones;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", poblacion='" + poblacion + '\'' +
                ", provincia='" + provincia + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", nif='" + nif + '\'' +
                ", numeroSeguridadSocial='" + numeroSeguridadSocial + '\'' +
                ", numeroColegiado='" + numeroColegiado + '\'' +
                ", categoriaLaboral='" + categoriaLaboral + '\'' +
                ", horarioConsulta=" + horarioConsulta +
                ", fechaAlta=" + fechaAlta +
                ", fechaBaja=" + fechaBaja +
                ", vacaciones=" + vacaciones +
                ", citas=" + citas +
                ", pacientes=" + pacientes +
                '}';
    }

}