package dev.miguel.pooclasesabstractas.form;

import dev.miguel.pooclasesabstractas.form.elementos.ElementoForm;
import dev.miguel.pooclasesabstractas.form.elementos.InputForm;
import dev.miguel.pooclasesabstractas.form.elementos.SelectForm;
import dev.miguel.pooclasesabstractas.form.elementos.TextAreaForm;
import dev.miguel.pooclasesabstractas.form.elementos.select.Opcion;
import dev.miguel.pooclasesabstractas.form.validator.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {

    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidator(new RequiredValidator());

        InputForm password = new InputForm("clave", "password");
        password.addValidator(new RequiredValidator())
                .addValidator(new LenghtValidator(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidator(new RequiredValidator())
                .addValidator(new EmailValidator());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidator(new RequiredValidator())
                .addValidator(new NumberValidator());

        TextAreaForm experiencia = new TextAreaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidator(new NotNullValidator());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "JavaScript"))
        .addOpcion(new Opcion("3", "TypeScript").setSelected())
        .addOpcion(new Opcion("4", "Go"))
        .addOpcion(new Opcion("5", "Python"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input readonly name='" + this.nombre + "' value=\"" + this.valor + "\"";
            }
        };

        saludar.setValor("!Hola¡ Este campo esta deshabilitado");

        username.setValor("Elmigue");
        password.setValor("");
        email.setValor("miguel@email.com");
        edad.setValor("21");
        experiencia.setValor("... mas de 5 años de experiencia ...");

        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        elementos.forEach( e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach( e -> {
            if(!e.esValido()){
                e.getErrors().forEach(System.out::println);
            }
        });

    }
}
