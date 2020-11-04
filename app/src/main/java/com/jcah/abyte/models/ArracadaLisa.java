package com.jcah.abyte.models;

import java.io.Serializable;

public class ArracadaLisa implements Serializable {

    private int foto;
    private String codigo;
    private String descripcion;
    private String pesoProm;

    public ArracadaLisa() {
    }

    public ArracadaLisa(int foto, String codigo, String descripcion, String pesoProm) {
        this.foto = foto;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.pesoProm = pesoProm;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
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

    public String getPesoProm() {
        return pesoProm;
    }

    public void setPesoProm(String pesoProm) {
        this.pesoProm = pesoProm;
    }
}
