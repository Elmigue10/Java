package dev.miguel.poointerfaces.imprenta.model;

public class Pagina extends Hoja implements Imprimible{

    public Pagina(String content) {
        super(content);
    }

    @Override
    public String imprimir() {
        return this.content;
    }
}
