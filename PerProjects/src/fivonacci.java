import javax.swing.*;
import java.util.Scanner;

public class fivonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner nd = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        byte i = nd.nextByte();

        while (i >= 0) {
            int c = (int) (a + b);
            System.out.println(a + "+" + b + "=" + c);
            a = b;
            b = c;
            i--;
        }
    }
}
