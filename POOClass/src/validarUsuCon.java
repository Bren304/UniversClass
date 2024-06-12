import java.util.Scanner;

public class validarUsuCon {
    public static void main(String[] args) {
        //Validar contraseña y contraseña con limite de intentos

        //Usuario y contraseña ya creado
        String userDB = "Bren", pswDB = "12345";

        //Declarar vaiables
        String user, psw, sist;
        byte cont = 0, maxInt = 5;
        Scanner nd = new Scanner(System.in);

        while(cont < 5){
            System.out.println("Digite el usuario");
            user = nd.nextLine();
            System.out.println("Digite la contraseña");
            psw = nd.nextLine();
            if(user.equals(userDB) && psw.equals(pswDB)){
                System.out.println("Ha ingresado al sistema");
                cont = 5;
            }else{
                System.out.println("Usuario o contraseña incorrectos");
                cont++;
                System.out.println("Intentos restantes: " + (maxInt - cont));
            }
        }
    }
}