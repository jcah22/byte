package com.jcah.abyte.models;

import java.io.Serializable;

public class Argolla14Mov implements Serializable {

    public String codigo;
    public String descripcion;
    public String peso;
    public int foto;

    public Argolla14Mov() {
    }

    public Argolla14Mov(String codigo, String descripcion, String peso, int foto) {
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
