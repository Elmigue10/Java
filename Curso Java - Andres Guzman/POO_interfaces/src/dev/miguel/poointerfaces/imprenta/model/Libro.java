package dev.miguel.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Imprimible> paginas;
    private String autor;
    private String title;
    private Genre genre;

    public Libro(String autor, String title, Genre genre) {
        this.autor = autor;
        this.title = title;
        this.genre = genre;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.title).append("\n")
                .append("Autor: ").append(this.autor).append("\n")
                .append("Genero: ").append(this.genre).append("\n");

        for (Imprimible pag : this.paginas){
            sb.append(pag.imprimir()).append("\n");
        }

        return sb.toString();
    }
}
