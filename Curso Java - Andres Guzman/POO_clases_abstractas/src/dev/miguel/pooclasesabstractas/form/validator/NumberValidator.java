package dev.miguel.pooclasesabstractas.form.validator;

public class NumberValidator extends Validator{

    protected String mensaje = "El campo %s debe ser númerico";

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
        try{
            Integer.parseInt(valor);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
