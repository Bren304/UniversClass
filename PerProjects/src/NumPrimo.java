import java.util.Scanner;
public class NumPrimo {
    public static void main(String[] args) {
        /*
        Programa para identificar si un número es primo o no.
        Caraceterísticas: El número primo solo es divisible en 1 y por sí mismo
         */

        //Declaráción de variables
        float num;
        int cont, modulo;
        Scanner nd = new Scanner(System.in);

        do{
            cont = 0;
            System.out.println("Digite un número (0 para finalizar)");
            num = nd.nextFloat();
            if (num % 2 == 0 && num != 2){
                cont++;
            }else{
                for (int i = 3; i <= num/2; i+=2){
                    System.out.println(num+"/"+i+" = "+(num/i));
                    modulo = (int) ((num % i));
                    if (modulo == 0){
                        cont++;
                        break;
                    }
                }
            }
            System.out.println(cont);
            if(cont == 0){
                System.out.println("El número: " + num + " es primo");
            }else System.out.println("El número: " + num + " no es primo");
        }while(num != 0);
    }
}