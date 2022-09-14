package dev.miguel.pooclasesabstractas.form.validator;

public class RequiredValidator extends Validator{

    protected String mensaje = "El campo %s es requerido";

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        return (valor != null && !valor.isBlank());
    }
}
