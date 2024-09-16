package models;

public class Medicamento {
    private String nombreComercial;
    private String nombreGenerico;
    private String laboratorio;
    private boolean esGenerico;
    private String dosisAdultos;
    private String dosisNinos;
    private boolean requiereReceta;
    private boolean cubiertoPOS;
    private int unidadesDisponibles;
    private PrincipioActivo principioActivo;

    // Constructor
    public Medicamento() {

    }

    public Medicamento(String nombreComercial, String nombreGenerico, String laboratorio,
            boolean esGenerico, String dosisAdultos, String dosisNinos, boolean requiereReceta,
            boolean cubiertoPOS, int unidadesDisponibles, PrincipioActivo principioActivo) {
        this.nombreComercial = nombreComercial;
        this.nombreGenerico = nombreGenerico;
        this.laboratorio = laboratorio;
        this.esGenerico = esGenerico;
        this.dosisAdultos = dosisAdultos;
        this.dosisNinos = dosisNinos;
        this.requiereReceta = requiereReceta;
        this.cubiertoPOS = cubiertoPOS;
        this.unidadesDisponibles = unidadesDisponibles;
        this.principioActivo = principioActivo;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNombreGenerico() {
        return nombreGenerico;
    }

    public void setNombreGenerico(String nombreGenerico) {
        this.nombreGenerico = nombreGenerico;
    }

    public String getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(String laboratorio) {
        this.laboratorio = laboratorio;
    }

    public boolean isEsGenerico() {
        return esGenerico;
    }

    public void setEsGenerico(boolean esGenerico) {
        this.esGenerico = esGenerico;
    }

    public String getDosisAdultos() {
        return dosisAdultos;
    }

    public void setDosisAdultos(String dosisAdultos) {
        this.dosisAdultos = dosisAdultos;
    }

    public String getDosisNinos() {
        return dosisNinos;
    }

    public void setDosisNinos(String dosisNinos) {
        this.dosisNinos = dosisNinos;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    public boolean isCubiertoPOS() {
        return cubiertoPOS;
    }

    public void setCubiertoPOS(boolean cubiertoPOS) {
        this.cubiertoPOS = cubiertoPOS;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public PrincipioActivo getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(PrincipioActivo principioActivo) {
        this.principioActivo = principioActivo;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", nombreGenerico='" + nombreGenerico + '\'' +
                ", laboratorio='" + laboratorio + '\'' +
                ", esGenerico=" + esGenerico +
                ", dosisAdultos='" + dosisAdultos + '\'' +
                ", dosisNinos='" + dosisNinos + '\'' +
                ", requiereReceta=" + requiereReceta +
                ", cubiertoPOS=" + cubiertoPOS +
                ", unidadesDisponibles=" + unidadesDisponibles +
                ", principioActivo=" + (principioActivo != null ? principioActivo.getNombre() : "Sin principio activo")
                +
                '}';
    }

}
