package com.example.alex.turuta.Model;

public class RutasModel {


    private int fondo;
    private String precio;
    private int icono;

    public RutasModel() {
    }

    public RutasModel(int fondo, String precio, int icono) {
        this.fondo = fondo;
        this.precio = precio;
        this.icono = icono;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }
}
