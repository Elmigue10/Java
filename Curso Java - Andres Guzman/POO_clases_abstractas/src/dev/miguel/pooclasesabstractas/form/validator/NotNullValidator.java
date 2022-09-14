package dev.miguel.pooclasesabstractas.form.validator;

public class NotNullValidator extends Validator{

    protected String mensaje = "El campo %s no puede ser nulo";

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
        return (valor != null);
    }
}
