package Matrices;

public class EjemploMatricesBuscarElemento {

    public static void main(String[] args) {

        int[][] matrizEnteros={
                {35, 90, 3, 1978},
                {15, 2022, 10, 26},
                {677, 127, 32767, 1999}
        };

        int elementoBuscado = 26;
        boolean elementoEncontrado = false;

        int i;
        int j = 0;
        buscar: for (i = 0; i < matrizEnteros.length; i++) {
            for (j = 0; j < matrizEnteros[i].length; j++) {
                if(matrizEnteros[i][j] == elementoBuscado){
                    elementoEncontrado = true;
//                  Solo rompe el primer for
//                  break;
                    break buscar;
                }
            }
        }

        if(elementoEncontrado){
            System.out.println("Encontrado: " + elementoBuscado + " en las coordenadas " + i +", " + j);
        } else {
            System.out.println(elementoBuscado + " no existe en la matriz");
        }

    }

}
