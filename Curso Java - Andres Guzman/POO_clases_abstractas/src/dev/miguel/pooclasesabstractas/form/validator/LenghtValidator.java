package dev.miguel.pooclasesabstractas.form.validator;

import dev.miguel.pooclasesabstractas.form.validator.mensaje.IMensajeFormateable;

public class LenghtValidator extends Validator implements IMensajeFormateable {

    protected String mensaje = "El campo %s debe tener un mínimo %d caracteres y máximo %d caracteres";

//  Por defecto el valor de un Integer o int es cero
    private int min;
    private int max = Integer.MAX_VALUE;

    public LenghtValidator(){  }

    public LenghtValidator(int min, int max){
        this.min = min;
        this.max = max;
    }

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
//        this.mensaje = String.format(this.mensaje, this.min, this.max);
        if(valor == null){
            return true;
        }
        int length = valor.length();
        return (length >= min && length <= max);
    }

    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo, this.min, this.max);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

}
