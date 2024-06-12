import java.util.Scanner;

public class optionDoWhile {
    public static void main(String[] args) {
        //El menú de opciones se repite hasta que el usuario salga

        //Declarar variables
        Scanner nd = new Scanner(System.in);
        String menuOpt;

        do {
            System.out.println("#### Menú de opciones ####");
            System.out.println("1. Primer caso...");
            System.out.println("2. Segundo caso...");
            System.out.println("3. Tercer caso...");
            System.out.println("4. Cuarto caso...");
            System.out.println("0. Terminar o salir...");
            System.out.println("Selecione una opcción del menú");
            menuOpt = nd.nextLine();

            switch(menuOpt){
                case "1":
                    //Bloque de código
                    System.out.println("---------------------");
                    System.out.println("Seleccionó 1");
                    System.out.println("---------------------");
                    break;
                case "2":
                    //Bloque de código
                    System.out.println("---------------------");
                    System.out.println("Seleccionó 2");
                    System.out.println("---------------------");
                    break;
                case "3":
                    //Bloque de código
                    System.out.println("---------------------");
                    System.out.println("Seleccionó 3");
                    System.out.println("---------------------");
                    break;
                case "4":
                    //Bloque de código
                    System.out.println("---------------------");
                    System.out.println("Seleccionó 4");
                    System.out.println("---------------------");
                    break;
                case "0":
                    //Bloque de código
                    System.out.println("---------------------");
                    System.out.println("Has salido del sistema");
                    System.out.println("---------------------");
                    break;
                default:
                    //Bloque de código
                    System.out.println("---------------------");
                    System.out.println("Ingrese una opción válida");
                    System.out.println("---------------------");
                    break;
            }
        }while(!menuOpt.equals("0"));
    }
}
