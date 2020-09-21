package com.jcah.abyte.models;

import java.io.Serializable;

public class ArgollaDiezK implements Serializable {

    private String codigo;
    private String descripcion;
    private String peso;
    private int foto;

    public ArgollaDiezK(String codigo, String descripcion, String peso, int foto) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
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

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
