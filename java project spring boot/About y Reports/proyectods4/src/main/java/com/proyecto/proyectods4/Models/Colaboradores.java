package com.proyecto.proyectods4.Models;

public class Colaboradores {
    private int id_col;
    private String contenido;
    private String imagen;
    private String colaborador;

    
    public Colaboradores(int id_col, String contenido, String imagen, String colaborador) {
        this.id_col = id_col;
        this.contenido = contenido;
        this.imagen = imagen;
        this.colaborador = colaborador;
    }
    
    public int getId_col() {
        return id_col;
    }
    public void setId_col(int id_col) {
        this.id_col = id_col;
    }
    public String getContenido() {
        return contenido;
    }
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public String getImagen() {
        return imagen;
    }
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    public String getColaborador() {
        return colaborador;
    }
    public void setColaborador(String colaborador) {
        this.colaborador = colaborador;
    }
}
