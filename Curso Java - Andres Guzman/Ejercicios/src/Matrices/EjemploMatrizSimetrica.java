package Matrices;

public class EjemploMatrizSimetrica {

    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3,4},
                {2,1,0,5},
                {3,0,1,6},
                {4,5,6,7}
        };

        boolean esSimetrica = true;

        int i;
        int j;
        i = 0;

//        while (i < matriz.length && esSimetrica == true){
//            j=0;
//            while(j < i && esSimetrica == true){
//                if(matriz[i][j] != matriz[j][i]){
//                    esSimetrica = false;
//                }
//                j ++;
//            }
//            i ++;
//        }

        salir: while (i < matriz.length){
            j=0;
            while(j < i){
                if(matriz[i][j] != matriz[j][i]){
                    esSimetrica = false;
                    break salir;
                }
                j ++;
            }
            i ++;
        }

//        salir: for (i=0; i < matriz.length; i++){
//            for(j=0; j < i; j++){
//                if(matriz[i][j] != matriz[j][i]){
//                    esSimetrica = false;
//                    break salir;
//                }
//                j ++;
//            }
//            i ++;
//        }
//
        if(esSimetrica){
            System.out.println("La matriz es simétrica!");
        } else {
            System.out.println("La matriz no es simétrica :(");
        }

    }

}
