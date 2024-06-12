public class Cod2_dScript {
    public static float [][]diamAlt(short cantRecipiente){
        float [][]diamAlt = new float [cantRecipiente][2];
        for (int i = 0; i < cantRecipiente; i++) {
            for (int j = 0; j < diamAlt[0].length; j++) {
                diamAlt[i][j] = (float)(Math.random()*10+1);
            }
        }
        return diamAlt;
    }
    public static float clasificacionRecipCilind(float diametro, float altura){
        float volRecipCilin = (float)(Math.PI * Math.pow(diametro/2, 2)*altura);
        return volRecipCilin;
    }
    public static int[][] clasiRecipCilin(float []volRecip){
        int [][]clasiRepic = new int [7][3];

        for (int i = 0; i < volRecip.length; i++) {
            if (volRecip[i] >= 40 && volRecip[i] <= 60){
                clasiRepic[0][0] = clasiRepic[0][0]+1;
            }
            else if (volRecip[i] >= 80 && volRecip[i] <= 120){
                clasiRepic[1][0]++;
            }
            else if (volRecip[i] >= 140 && volRecip[i] <= 200){
                clasiRepic[2][0]++;
            }
            else if (volRecip[i] >= 240 && volRecip[i] <= 260){
                clasiRepic[3][0]++;
            }else if (volRecip[i] >= 300 && volRecip[i] <= 500){
                clasiRepic[4][0]++;
            }else if (volRecip[i] >= 600 && volRecip[i] <= 1000){
                clasiRepic[5][0]++;
            }else{
                clasiRepic[6][0]++;
            }
        }
        //Copa
        clasiRepic[0][1] = clasiRepic[0][0] / 10; //Determina la cantidad de cajas
        clasiRepic[0][2] = clasiRepic[0][0] % 10; //Unidades sin caja

        //Vase
        clasiRepic[1][1] = clasiRepic[1][0] / 6;
        clasiRepic[1][2] = clasiRepic[1][0] % 6;

        //Frasco
        clasiRepic[2][1] = clasiRepic[1][0] / 40;
        clasiRepic[2][2] = clasiRepic[1][0] % 40;

        //Bot. Pequeña
        clasiRepic[3][1] = clasiRepic[1][0] / 30;
        clasiRepic[3][2] = clasiRepic[1][0] % 30;

        //Bot Mediana
        clasiRepic[4][1] = clasiRepic[1][0] / 20;
        clasiRepic[4][2] = clasiRepic[1][0] % 20;

        //Bot. Grande
        clasiRepic[5][1] = clasiRepic[1][0] / 10;
        clasiRepic[5][2] = clasiRepic[1][0] % 10;

        //Descarte
        clasiRepic[5][1] = clasiRepic[1][0] / 100;
        clasiRepic[5][2] = clasiRepic[1][0] % 100;

        return clasiRepic;
    }
}
