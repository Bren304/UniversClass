import java.util.Scanner;

public class tipoRecip  {
    public static void main(String[] args) {
        while(true) {
            float diam, h, r, vol;
            String resp;
            Scanner nd = new Scanner(System.in);
            System.out.println("Ingrese la altura del recipiente");
            h = nd.nextFloat();

            System.out.println("Ingrese el diámetro del recipiente");
            diam = nd.nextFloat();

            r = diam / 2;
            vol = (3.1415926535897f * (r * r)) * h;

            if (vol >= 40 && vol <= 60){
                resp = "copa";
            } else if (vol >= 80 && vol <= 120) {
                resp = "vaso";
            } else if (vol >= 140 && vol <= 200) {
                resp = "frasco";
            } else if (vol == 250) {
                resp = "bot. Pequeña";
            } else if (vol >= 300 && vol <= 500) {
                resp = "bot. Mediana";
            } else if (vol >= 600 && vol <= 1000) {
                resp = "bot. Grande";
            } else resp = "descartado";

            System.out.println("El recipiente pertenece a la categoría de " + resp);
            System.out.println("--------------------------------------------");
        }
    }
}
