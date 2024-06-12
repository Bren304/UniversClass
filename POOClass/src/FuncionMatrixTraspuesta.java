public class FuncionMatrixTraspuesta {
    public static void main(String[] args) {
        //Hola :)

        byte[][] matriz = {{1, 2, 3, 4, 5},{6, 7, 8, 9, 10}};

    }

    //Función para hallar la traspuesta de una matriz sin importar su tamaño
    public static byte[][] matriztraspuesta (byte [][]matriz){
        byte [][] matriztraspuesta = new byte [matriz[0].length][matriz.length];

        //Transformación
        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriztraspuesta[j][i] = matriz[i][j];
            }
        }
        return matriztraspuesta;
    }

    public static void imprimirmatriz(byte [][]matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                System.out.println(matriz[i][j] + "\t\t");
            }
        }
    }
}