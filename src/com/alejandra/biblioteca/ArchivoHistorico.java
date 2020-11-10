package com.alejandra.biblioteca;

public class ArchivoHistorico extends Recurso  {
    public ArchivoHistorico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "ArchivoHistorico{"+ getNombre() + "}";
    }
}
