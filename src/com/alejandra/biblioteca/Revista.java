package com.alejandra.biblioteca;

public class Revista extends Recurso implements Prestable {
    public Revista(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Revista{ "+getNombre() + "}";
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
