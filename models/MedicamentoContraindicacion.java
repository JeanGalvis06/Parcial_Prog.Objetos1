package models;

public class MedicamentoContraindicacion {
    private Medicamento medicamento;
    private Contraindicacion contraindicacion;

    public MedicamentoContraindicacion() {

    }

    public MedicamentoContraindicacion(Medicamento medicamento, Contraindicacion contraindicacion) {
        this.medicamento = medicamento;
        this.contraindicacion = contraindicacion;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Contraindicacion getContraindicacion() {
        return contraindicacion;
    }

    public void setContraindicacion(Contraindicacion contraindicacion) {
        this.contraindicacion = contraindicacion;
    }

    @Override
    public String toString() {
        return "MedicamentoContraindicacion{" +
                "medicamento=" + (medicamento != null ? medicamento.getNombreComercial() : "Sin medicamento") +
                ", contraindicacion="
                + (contraindicacion != null ? contraindicacion.getDescripcion() : "Sin contraindicacion") +
                '}';
    }

}
