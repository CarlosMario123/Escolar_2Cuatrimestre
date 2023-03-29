package com.example.proyectopoofinal;

public class Trabajador {
    private String nombre;
    private String Apellido;
    private int ClaveIdentificador;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getClaveIdentificador() {
        return ClaveIdentificador;
    }

    public void setClaveIdentificador(int claveIdentificador) {
        ClaveIdentificador = claveIdentificador;
    }

    public Trabajador(String nombre, String apellido, int claveIdentificador) {
        this.nombre = nombre;
        Apellido = apellido;
        ClaveIdentificador = claveIdentificador;
    }
}
