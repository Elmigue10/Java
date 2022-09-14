package dev.miguel.pooclasesabstractas.form.validator;

abstract public class Validator {

    protected String mensaje;

    abstract public void setMensaje(String mensaje);
    abstract public String getMensaje();
    abstract public boolean esValido(String valor);

}
