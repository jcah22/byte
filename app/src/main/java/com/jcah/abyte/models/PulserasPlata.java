package com.jcah.abyte.models;

import java.io.Serializable;

public class PulserasPlata implements Serializable {

    private String codigo;
    private String descripcion;
    private int foto;

    public PulserasPlata() {
    }

    public PulserasPlata(String codigo, String descripcion, int foto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.foto = foto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}




