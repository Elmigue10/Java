package dev.miguel.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculum(String persona, String carrera, String content) {
        super(content);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencia(String experiencia){
        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        sb.append(persona).append("\n")
                .append("Resumen: ").append(this.content)
                .append("\n").append("Profesión: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: ").append("\n");

        for( String e : this.experiencias ){
            sb.append("- ").append(e).append("\n");
        }

        return sb.toString();
    }
}
