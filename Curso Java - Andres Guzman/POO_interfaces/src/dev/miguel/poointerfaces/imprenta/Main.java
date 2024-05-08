package dev.miguel.poointerfaces.imprenta;

import dev.miguel.poointerfaces.imprenta.model.*;

import static dev.miguel.poointerfaces.imprenta.model.Genre.AVENTURA;

public class Main {
    public static void main(String[] args) {
        Curriculum cur = new Curriculum("Peter", "Fotografia", "Fotografo en el clarin");
        cur.addExperiencia("clarin")
                .addExperiencia("avengers")
                .addExperiencia("Hollywood");

        Informe informe = new Informe( "Peter Parker", "Jonah Jameson", "Estudio sobre los simbiontes");

        imprimir(cur);
        imprimir(informe);

        Libro libro = new Libro("Miguel Cervantes", "Don quijote de la mancha", AVENTURA);
        libro.addPagina(new Pagina("Introducción"))
                .addPagina(new Pagina("Nudo"))
                .addPagina(new Pagina("Desenlace"));

        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}