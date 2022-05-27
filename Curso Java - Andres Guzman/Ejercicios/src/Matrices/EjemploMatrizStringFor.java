package Matrices;

public class EjemploMatrizStringFor {

    public static void main(String[] args) {

//        String[][] nombres = {{"Spiderman","Capitán America"},{"Iron Man", "Thor"},{"Hawk Eye", "Doctor Strange"}};
        String[][] nombres = new String[3][2];
        nombres[0][0] = "Spiderman";
        nombres[0][1] = "Capitán America";

        nombres[1][0] = "Iron Man";
        nombres[1][1] = "Thor";

        nombres[2][0] = "Hawk Eye";
        nombres[2][1] = "Doctor Strange";

        System.out.println("....::::Iterando con for::::....");
        for (int i = 0; i < nombres.length; i++) {

            for (int j = 0; j < nombres[i].length; j++) {
                System.out.print(nombres[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("....::::Iterando con foreach::::....");
        for(String[] fila:nombres){
            for(String nombre: fila){
                System.out.print(nombre + "\t");
            }
            System.out.println();
        }
        
    }

}
