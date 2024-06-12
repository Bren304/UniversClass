import java.util.Scanner;

public class Cod1_dScript {
    public static void main(String[] args) {
        Scanner nd = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de recipiente para producir en el día");
        short cantRecipiente = nd.nextShort();


        float [][]diamAlt = Cod2_dScript.diamAlt(cantRecipiente);
        float []volRecip = new float[cantRecipiente];
        for (int i = 0; i < cantRecipiente; i++) {
            volRecip[i] = Cod2_dScript.clasificacionRecipCilind(diamAlt[i][0], diamAlt[i][1]);
        }
        int clasifRecip[][] = Cod2_dScript.clasiRecipCilin(volRecip);
        String tipoRecip[] = {"Copa", "Vaso", "Frasco", "Bot. Pequeña", "Bot. Mediana", "Bot. Grande", "Descarte"};
        System.out.println("TipRec \t\t CanRec\t\t CanCaj \t\t UnSCaj");

        for (int i = 0; i < clasifRecip.length; i++) {
            System.out.println(tipoRecip[i] + "\t\t" +
                    clasifRecip[i][0] + "\t\t" +
                    clasifRecip[i][1] + "\1\1" +
                    clasifRecip[i][2]);
        }
    }
}
