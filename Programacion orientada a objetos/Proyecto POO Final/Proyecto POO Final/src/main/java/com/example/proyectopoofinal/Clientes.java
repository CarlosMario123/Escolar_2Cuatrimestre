package com.example.proyectopoofinal;

public class Clientes {
    private String Nombre;
    private String Apellido;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Clientes(String nombre, String apellido) {
        Nombre = nombre;
        Apellido = apellido;
    }
}
