import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        System.out.println("Este programa es una calculadora");

        float n1, n2, opt,oper = 0;
        Scanner nd = new Scanner(System.in);

        System.out.println("Ingrese un 1er número");
        n1 = nd.nextFloat();
        System.out.println("Ingrese un 2do número");
        n2 = nd.nextFloat();

        System.out.println("Antes de continuar, ingrese una de las siguientes opciones:");
        System.out.println("1: suma");
        System.out.println("2: resta");
        System.out.println("3: multiplicación");
        System.out.println("4: división");
        opt = nd.nextFloat();

        if(opt == 1){
            oper = n1 + n2;
        }else if(opt == 2){
            oper = n1 -n2;
        }else if(opt == 3){
            oper = n1 * n2;
        }else if(opt == 4){
            oper = n1/n2;
        }else System.out.println("Opción no valida");
        System.out.println("La respuesta es: " + oper);
    }
}
