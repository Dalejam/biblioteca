package com.alejandra.biblioteca;

public class Libro extends Recurso implements Prestable{

    public Libro(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Libro { " + getNombre() + " }";
    }

    @Override
    public void prestar() {
        this.prestado=true;
    }
    @Override
    public void devolver() {
        this.prestado=false;
    }
}
