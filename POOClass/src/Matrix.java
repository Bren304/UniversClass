public class Matrix {
    public static void main(String[] args) {
        //Ejemplo de matrices

        //Declaracion y asisgnación de variables
        byte [][]matrix = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Tamaño filas " + matrix.length);
        System.out.println("Tamaño columnas (matrix[0].length) " + matrix[0].length);

        for(byte i = 0; i < 2; i++){ //Filas
            for(byte j = 0; j < 3; j++){ //Columnas
                System.out.print(matrix[i][j] + "\t\t\t");
            }
            System.out.println();
        }
    }
}
