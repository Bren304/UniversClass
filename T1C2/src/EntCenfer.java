import java.util.Scanner;

public class EntCenfer {
    static float acum = 0;
    public static void main(String[] args) {
        validacion();

    }

    public static void validacion(){
        String vendedor = "user123", pswven = "12345";
        Scanner nd = new Scanner(System.in);

        byte cont = 0, IntMax = 4;
        String user, psw;

        while(cont < 5){
            System.out.println("Ingrese el usuario");
            user = nd.nextLine();
            System.out.println("Ingrese la contraseña");
            psw = nd.nextLine();

            if(user.equals(vendedor) && psw.equals(pswven)){
                System.out.println("Ha ingresado el sistema");
                System.out.println("#######################");
                cont = 5;
                Cenfer();
            }else {
                System.out.println("Usuario o contraseña incorrecta");
                System.out.println("Inténtelo nuevamente");
                System.out.println("Intentos restantes: " + (IntMax - cont));
                cont = (byte)(cont +1);
                if (cont == 5){
                    System.out.println("Muchos intentos...");
                    System.out.println("Sistema bloqueado por dos horas");
                }
            }
        }
    }

    public static void Cenfer(){
        byte opt, n = 1;
        int cont = 0;
        Scanner nd = new Scanner(System.in);

        while(n > 0){
            System.out.println("Seleccione una de la siguientes opciones");
            System.out.println("------------");
            System.out.println("1. Registrar ingreso de visitante");
            System.out.println("2. Ver cantidad de personas registradas");
            System.out.println("3. Saldo acumulado de registrados");
            System.out.println("0. Terminar o Salir");

            opt = nd.nextByte();
            if(opt == 1) {
                edad();
                cont = cont + 1;
            }if(opt == 2){
                System.out.println("La cantidad de registros actual es de: " + cont);
            }if(opt == 3){
                System.out.println("Cantidad de registros actual: " + acum);
            }if (opt == 0){
                n = 0;
                System.out.println("La cantidad de registros en el día fue de: " + cont);
                System.out.println("El saldo total acumulado fue de: " + acum);
            }
        }
    }

    public static void edad(){
        byte edad;
        float tarifa = 100000, precio;

        Scanner inedad = new Scanner(System.in);

        System.out.println("Ingrese la edad de la persona");
        edad = inedad.nextByte();

        if(edad < 12){
            precio = tarifa - tarifa*0.80f;
            acum = acum+precio;
        }else if(edad < 18){
            precio = tarifa - tarifa*0.60f;
            acum = acum+precio;
        }else if(edad > 60){
            precio = tarifa - tarifa*0.40f;
            acum = acum+precio;
        }else{
            precio = tarifa;
            acum = acum+precio;
        }
        System.out.println("El valor de la entrada es: " + precio);
        System.out.println("#########################");
    }
}