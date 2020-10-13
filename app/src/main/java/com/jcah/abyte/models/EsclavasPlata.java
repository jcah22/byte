package com.jcah.abyte.models;

import java.io.Serializable;

public class EsclavasPlata implements Serializable {

    private String codigo;
    private  String descripcion;
    private  String foto;

    public EsclavasPlata() {
    }

    public EsclavasPlata(String codigo, String descripcion, String foto) {
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
