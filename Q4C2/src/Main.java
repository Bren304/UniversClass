public class Main {
    public static void main(String[] args) {
        byte []vectorPar;
        vectorPar = new byte[10];
        byte []vectorImpar;
        vectorImpar = new byte[10];
        float promPar = 0, promImpar = 0;

        for (byte i = 0; i < vectorImpar.length; i++ ){
            vectorPar[i] = (byte)(i*2);
            promPar = promPar + vectorPar[i];
            System.out.println();
            vectorImpar[i] = (byte)((i+1)*2-1);
            promImpar = promImpar + vectorImpar[i];
            System.out.println("vectoPar["+i+"] = " + vectorPar[i]
                    +"\t\t\tvectoImpar["+i+"] = " + vectorImpar[i]);
        }

        System.out.println("------------------------------------------");

        promPar = promPar / vectorPar.length;
        promImpar = promImpar / vectorImpar.length;
        System.out.println("El promedio del vector par es = " + promPar);
        System.out.println("El promedio del vector par es = " + promImpar);

        System.out.println("------------------------------------------");

        for (byte impar:vectorImpar) {
            System.out.println("Impar = " + impar);
        }
        System.out.println("------------------------------------------");
        for (byte par:vectorPar) {
            System.out.println("Impar = " + par);
        }
    }
}