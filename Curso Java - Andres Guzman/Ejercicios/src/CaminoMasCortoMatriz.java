public class CaminoMasCortoMatriz {


    public static void main(String[] args) {
        int[] myArray = { 3, 2, 9, 6, 5, 3, 5, 7, 5, 1, 2, 3, 4, 5, 6, 7};
        int n = 1;
        if (myArray.length == 16){
            n = 4;
        } else if (myArray.length == 9){
            n = 3;
        } else if (myArray.length == 2){
            n = 2;
        }
        int filas = n;
        int columnas = n;
        int x = 0;
        int menor = 9;
        int matriz[][] = new int[filas][columnas];
        int[] camino = new int[n];
        for(int i=0;i<filas;i++){
            for(int j=0; j<columnas;j++){
                matriz[i][j]=myArray[x];
                x=x+1;
            }
        }
        int control =0;
        for(int i=0;i<columnas;i++){
            for(int j=0; j<filas;j++){
                if(matriz[j][i]<menor){
                    if(control==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }
                    else if(control+1==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }
                    else if(control-1==j){
                        menor=matriz[j][i];
                        camino[i]=menor;
                    }


                }
            }
            menor = 9;
        }

        for(int i=0;i<camino.length;i++){
            System.out.print(camino[i]);
            if (i < camino.length-1){
                System.out.print(" ");
            }
        }
    }


}
