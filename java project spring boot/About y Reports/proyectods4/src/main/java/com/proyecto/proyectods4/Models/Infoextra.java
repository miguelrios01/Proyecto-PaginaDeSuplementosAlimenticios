package com.proyecto.proyectods4.Models;

public class Infoextra {
    private String titulo;
    private String sub_titulo;
    private String sub_titulo2;

    
    public Infoextra(String titulo, String sub_titulo, String sub_titulo2) {
        this.titulo = titulo;
        this.sub_titulo = sub_titulo;
        this.sub_titulo2 = sub_titulo2;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getSub_titulo() {
        return sub_titulo;
    }
    public void setSub_titulo(String sub_titulo) {
        this.sub_titulo = sub_titulo;
    }
    public String getSub_titulo2() {
        return sub_titulo2;
    }
    public void setSub_titulo2(String sub_titulo2) {
        this.sub_titulo2 = sub_titulo2;
    }
}
