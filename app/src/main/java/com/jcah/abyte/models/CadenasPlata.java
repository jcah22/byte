package com.jcah.abyte.models;

import java.io.Serializable;

public class CadenasPlata implements Serializable {
    private String codigo;
    private String descripcion;
    private int  foto;
    private String medida;

    public CadenasPlata() {
    }

    public CadenasPlata(String codigo, String descripcion, int foto, String medida) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.foto = foto;
        this.medida = medida;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }
}
