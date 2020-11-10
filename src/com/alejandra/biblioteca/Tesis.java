package com.alejandra.biblioteca;

public class Tesis extends Recurso {

    public Tesis(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Tesis{" + getNombre() + "}";
    }
}
