public class EjemploArgumentosLineaComandos {

    public static void main(String[] args) {

        if(args.length == 0){
            System.out.println("Se deben ingresar argumentos");
            System.exit(-1);
        }

        for (int i = 0; i < args.length; i++) {

            System.out.println("Argumentos #" + i +": " + args[i]);

        }

//        Comandos CLI
//        javac nombre-archivo.java
//        java nombre-archivo
//        javac nomrbe-archivo.java -encoding utf8
//        Pasar argumentos mediante intellijIdea: Edit Configurations del main Class -> Llenar los program arguments.

//        Ejemplo calculadora
         if(args.length != 3 ) {
             System.out.println("Por favor ingresar una operación (suma, resta, div o multi) y dos enteros");
             System.exit(-1);
         }

         String operacion = args[0];

         int a = Integer.parseInt(args[1]);
         int b = Integer.parseInt(args[2]);

         double resultado = 0.00;

         switch (operacion){
             case "suma":
                 resultado = a + b;
                 break;
             case "resta":
                 resultado = a - b;
                 break;
             case "div":
                if(b == 0){
                    System.out.println("No se puede divider por cero.");
                    System.exit(-1);
                }
                resultado = a/b;
                break;
             case "multi":
                resultado = a*b;
                break;
             default:
                 resultado = a+b;
         }

        System.out.println("Resultado de la operación " + operacion + " es: " + resultado);

    }
    
}
