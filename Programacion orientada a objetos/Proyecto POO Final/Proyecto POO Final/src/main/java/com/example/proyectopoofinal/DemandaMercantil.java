package com.example.proyectopoofinal;

public class DemandaMercantil extends Demanda {
private String empresaDemandada;

    public String getEmpresaDemandada() {
        return empresaDemandada;
    }

    public void setEmpresaDemandada(String empresaDemandada) {
        this.empresaDemandada = empresaDemandada;
    }

    public DemandaMercantil(Clientes cliente, Juzgado juzgado, Trabajador trabajador, String municipio, String ramo, String tipoDeJuicio, int numeroDeHojas, String fechaDePresentacion, String codigo, String empresaDemandada) {
        super(cliente, juzgado, trabajador, municipio, ramo, tipoDeJuicio, numeroDeHojas, fechaDePresentacion, codigo);
        this.empresaDemandada = empresaDemandada;
    }

}
