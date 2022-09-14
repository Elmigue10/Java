package dev.miguel.pooclasesabstractas.form.elementos;

import dev.miguel.pooclasesabstractas.form.validator.LenghtValidator;
import dev.miguel.pooclasesabstractas.form.validator.Validator;
import dev.miguel.pooclasesabstractas.form.validator.mensaje.IMensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    private List<Validator> validators;
    private List<String> errors;

    public ElementoForm(){
        this.validators = new ArrayList<>();
        this.errors = new ArrayList<>();
    }

    public ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public ElementoForm addValidator(Validator validator){
        this.validators.add(validator);
        return this;
    }

    public List<String> getErrors(){
        return errors;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validator validator : this.validators){
            if(!validator.esValido(this.valor)){
                if(validator instanceof IMensajeFormateable){
                    this.errors.add(((IMensajeFormateable) validator).getMensajeFormateado(nombre));
                } else {
                    this.errors.add(String.format(validator.getMensaje(), nombre));
                }
            }
        }
        return this.errors.isEmpty();
    }

    abstract public String dibujarHtml();

}
