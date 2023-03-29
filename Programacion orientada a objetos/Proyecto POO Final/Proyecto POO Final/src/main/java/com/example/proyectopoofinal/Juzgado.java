package com.example.proyectopoofinal;

import com.example.proyectopoofinal.enums.Municipio;

public class Juzgado {


    private int NumeroJuzgado;
    private String Lugar;
    private Municipio municipio;

    public int getNumeroJuzgado() {
        return NumeroJuzgado;
    }

    public void setNumeroJuzgado(int numeroJuzgado) {
        NumeroJuzgado = numeroJuzgado;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public Juzgado(int numeroJuzgado, String lugar) {
        NumeroJuzgado = numeroJuzgado;
        Lugar = lugar;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
}
