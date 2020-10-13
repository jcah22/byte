package com.jcah.abyte.models;

import java.io.Serializable;

public class AnillosPlata implements Serializable {

    private String codigo;
    private String descripcion;
    private String medida;
    private int foto;

    public AnillosPlata() {
    }

    public AnillosPlata(String codigo, String descripcion, String medida, int foto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.medida = medida;
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

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
