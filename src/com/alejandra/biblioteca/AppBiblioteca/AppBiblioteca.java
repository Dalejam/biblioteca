package com.alejandra.biblioteca.AppBiblioteca;

import com.alejandra.biblioteca.*;

import java.util.Arrays;

public class AppBiblioteca {
    public static void main(String[] args) {
        Biblioteca nacional = new Biblioteca();

        Libro milyunanoche = new Libro("Mil y Una noche");
        Revista semana = new Revista("vea");
        Tesis tCalculo = new Tesis("Tesis Calculo");
        Auditorio conferencia = new Auditorio("Auditorio Conferencia");
        ArchivoHistorico mapas = new ArchivoHistorico("Mapas Antiguios");

        nacional.addRecurso(Arrays.asList(milyunanoche,semana,tCalculo,conferencia,mapas));

        nacional.prestarRecurso(milyunanoche);
        nacional.prestarRecurso(semana);
        nacional.devolverRecurso(semana);
        nacional.prestarRecurso(conferencia);

        System.out.println("LOS RECURSOS PRESTADOS SON: ");
        nacional.listarPrestados();


    }
}
