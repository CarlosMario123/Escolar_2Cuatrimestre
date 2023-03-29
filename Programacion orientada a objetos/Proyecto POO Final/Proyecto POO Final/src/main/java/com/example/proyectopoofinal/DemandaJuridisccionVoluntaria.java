package com.example.proyectopoofinal;

public class DemandaJuridisccionVoluntaria extends Demanda {
    private String jurisdiccionVoluntaria;

    public String getJurisdiccionVoluntaria() {
        return jurisdiccionVoluntaria;
    }

    public void setJurisdiccionVoluntaria(String jurisdiccionVoluntaria) {
        this.jurisdiccionVoluntaria = jurisdiccionVoluntaria;
    }

    public DemandaJuridisccionVoluntaria(Clientes cliente, Juzgado juzgado, Trabajador trabajador, String municipio, String ramo, String tipoDeJuicio, int numeroDeHojas, String fechaDePresentacion, String codigo, String jurisdiccionVoluntaria) {
        super(cliente, juzgado, trabajador, municipio, ramo, tipoDeJuicio, numeroDeHojas, fechaDePresentacion, codigo);
        this.jurisdiccionVoluntaria = jurisdiccionVoluntaria;

    }
}
