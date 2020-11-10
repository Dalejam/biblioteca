package com.alejandra.biblioteca;

public class Auditorio extends Recurso implements Prestable{

    public Auditorio(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Auditorio{ "+getNombre()+ "}";
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
