public class password {

    public static void main(String[] args) {
        int []numeros = {1,2,3,4,5,6,7,8,9,9};

        for (int i = 0; i < 9; i++){
            if (numeros[i] == 0 || numeros[i] == 3 ||
                    numeros[i] == 4 || numeros[i]==8){

            }
            System.out.println(numeros[i]);
        }
    }
}
