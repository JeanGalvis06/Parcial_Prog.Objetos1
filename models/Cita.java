package models;

import java.util.Date;

public class Cita {
    private Date fecha;
    private String consultorio;
    private String institucionPrestadoraSalud;
    private String entidadPromotoraSalud;
    private Medico medico;
    private Paciente paciente;
    private Diagnostico diagnostico;

    // Constructor
    public Cita() {}
    
    public Cita(Date fecha, String consultorio, String institucionPrestadoraSalud, String entidadPromotoraSalud,
                Medico medico, Paciente paciente, Diagnostico diagnostico) {
        this.fecha = fecha;
        this.consultorio = consultorio;
        this.institucionPrestadoraSalud = institucionPrestadoraSalud;
        this.entidadPromotoraSalud = entidadPromotoraSalud;
        this.medico = medico;
        this.paciente = paciente;
        this.diagnostico = diagnostico;
    }

    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getInstitucionPrestadoraSalud() {
        return institucionPrestadoraSalud;
    }

    public void setInstitucionPrestadoraSalud(String institucionPrestadoraSalud) {
        this.institucionPrestadoraSalud = institucionPrestadoraSalud;
    }

    public String getEntidadPromotoraSalud() {
        return entidadPromotoraSalud;
    }

    public void setEntidadPromotoraSalud(String entidadPromotoraSalud) {
        this.entidadPromotoraSalud = entidadPromotoraSalud;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }


    @Override
    public String toString() {
        return "Cita{" +
                "fecha=" + fecha +
                ", consultorio='" + consultorio + '\'' +
                ", institucionPrestadoraSalud='" + institucionPrestadoraSalud + '\'' +
                ", entidadPromotoraSalud='" + entidadPromotoraSalud + '\'' +
                ", medico=" + (medico != null ? medico.getNombre() : "Sin medico") +
                ", paciente=" + (paciente != null ? paciente.getNombre() : "Sin paciente") +
                ", diagnostico=" + (diagnostico != null ? diagnostico.getNombre() : "Sin diagnostico") +
                '}';
    }
}