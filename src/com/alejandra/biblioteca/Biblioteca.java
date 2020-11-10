package com.alejandra.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;

public class Biblioteca {
    private String nombre;
    private List<Recurso> recurso;

    public Biblioteca(){this.recurso = new ArrayList<>(); }

    public void addRecurso(List<Recurso> r){
        this.recurso.addAll(r);

    }
    public boolean prestarRecurso(Prestable p){
        p.prestar();
        return true;
    }
    public boolean devolverRecurso(Prestable p){
        p.devolver();
        return false;
    }
    public void listarPrestados(){
        recurso.stream().filter(r-> r.isPrestado()==true).forEach(System.out::println);
    }

    public String getNombre() {
        return nombre;
    }

    public List<com.alejandra.biblioteca.Recurso> getRecurso() {
        return recurso;
    }
}
