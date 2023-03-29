package com.example.proyectopoofinal;

public class DemandaCivil extends Demanda {
    private String nombreDemandado;
    private String apellidoDemandado;

    public String getNombreDemandado() {
        return nombreDemandado;
    }

    public void setNombreDemandado(String nombreDemandado) {
        this.nombreDemandado = nombreDemandado;
    }

    public String getApellidoDemandado() {
        return apellidoDemandado;
    }

    public void setApellidoDemandado(String apellidoDemandado) {
        this.apellidoDemandado = apellidoDemandado;
    }

    public DemandaCivil(Clientes cliente, Juzgado juzgado, Trabajador trabajador, String municipio, String ramo, String tipoDeJuicio, int numeroDeHojas, String fechaDePresentacion, String codigo, String nombreDemandado, String apellidoDemandado) {
        super(cliente, juzgado, trabajador, municipio, ramo, tipoDeJuicio, numeroDeHojas, fechaDePresentacion, codigo);
        this.nombreDemandado = nombreDemandado;
        this.apellidoDemandado = apellidoDemandado;
    }




}
