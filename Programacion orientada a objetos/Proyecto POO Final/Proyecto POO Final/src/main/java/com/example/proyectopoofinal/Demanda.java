package com.example.proyectopoofinal;

public class Demanda {
   protected Clientes cliente;
   protected Juzgado juzgado;
   protected Trabajador trabajador;
   protected String municipio;
   protected String ramo;
   protected String tipoDeJuicio;
   protected int numeroDeHojas;
   protected String fechaDePresentacion;
   protected String codigo;


    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Juzgado getJuzgado() {
        return juzgado;
    }

    public void setJuzgado(Juzgado juzgado) {
        this.juzgado = juzgado;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getRamo() {
        return ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    public String getTipoDeJuicio() {
        return tipoDeJuicio;
    }

    public void setTipoDeJuicio(String tipoDeJuicio) {
        this.tipoDeJuicio = tipoDeJuicio;
    }

    public int getNumeroDeHojas() {
        return numeroDeHojas;
    }

    public void setNumeroDeHojas(int numeroDeHojas) {
        this.numeroDeHojas = numeroDeHojas;
    }

    public String getFechaDePresentacion() {
        return fechaDePresentacion;
    }

    public void setFechaDePresentacion(String fechaDePresentacion) {
        this.fechaDePresentacion = fechaDePresentacion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Demanda(Clientes cliente, Juzgado juzgado, Trabajador trabajador, String municipio, String ramo, String tipoDeJuicio, int numeroDeHojas, String fechaDePresentacion, String codigo) {
        this.cliente = cliente;
        this.juzgado = juzgado;
        this.trabajador = trabajador;
        this.municipio = municipio;
        this.ramo = ramo;
        this.tipoDeJuicio = tipoDeJuicio;
        this.numeroDeHojas = numeroDeHojas;
        this.fechaDePresentacion = fechaDePresentacion;
        this.codigo = codigo;
    }
}
