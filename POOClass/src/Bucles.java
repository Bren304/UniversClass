public class Bucles {

    public static void main(String[] args) {
        System.out.println("Programa para mostrar el funcionamiento de los bucles");
        System.out.println("-----------------------------------------------------");

        System.out.println("Bucle For");
        byte i;
        for(i=1; i<=10; i++){
            System.out.println("i: " + i);
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("Bucle While");
        byte j = 1;
        while(j <= 10){
            System.out.println("j: " + j);
            j++;
        }
        System.out.println("-----------------------------------------------------");

        System.out.println("Bucle Do-While");
        byte k = 0;
        do{
            System.out.println("k: " + k);
            k++;
        }while (k <= 10);
        System.out.println("-----------------------------------------------------");
    }
}
