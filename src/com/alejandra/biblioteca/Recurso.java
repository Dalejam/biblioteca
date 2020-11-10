package com.alejandra.biblioteca;

public abstract class Recurso {
    protected boolean prestado;
    private String nombre;

    public Recurso(String nombre) {
        this.nombre = nombre;
    }


    public boolean isPrestado() {
        return prestado;
    }

    public String getNombre() {
        return nombre;
    }



}
