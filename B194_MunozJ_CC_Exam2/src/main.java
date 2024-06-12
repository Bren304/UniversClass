import java.util.Scanner;

public class main {
    /*
    Un médico necesita calcular el Índice de Masa Corporal (IMC) de un paciente, el cual se establece como el peso (kg) sobre la estatura (m) al cuadrado [imc = peso / (estatura^2)]. Con el IMC es posible determinar si el nivel de peso del paciente, teniendo en cuenta:
Si el IMC  es inferior a 18.5, el Nivel de Peso es: "Bajo de Peso".
Si el IMC  está entre 18.5 y 24.9, el Nivel de Peso es: "Normal".
Si el IMC  está entre 25.0 y 29.9, el Nivel de Peso es: "Sobrepeso".
Si el IMC  es superio 29.9, el Nivel de Peso es: "Obesidad".
Realice una función que se llame imcPaciente que reciba como parámetro el peso y la estatura, y retorne el IMC del paciente.
Realice una función que se llame nivelPesoPaciente que reciba como parámetro el IMC calculado previamente y retorne el Nivel de Peso (Bajo de peso, Normal, Sobrepeso, Obesidad).
En una matriz de 2 columnas, en la columna cero (0) guarde el nombre del paciente y en la columna 1 el Nivel de Peso.
En una matriz de 3 columnas, el la columna cero (0) guarde el peso, en la columna 1 la estatura y en la columna 2 el IMC calculado.
Imprimir en pantalla las matrices de tal forma que se visualice los datos correspondientes de cada paciente, como se muestra en la siguiente imagen:
     */
    public static void main(String[] args){
        Scanner nd = new Scanner(System.in);

        String [][]nombre_imc = new String[3][2];
        float [][]pesoEstIMC = new float[3][3];

        for (int i = 0; i < nombre_imc.length; i++) {
            System.out.println("Digite el nombre del paciente " + (i+1) + ": ");
            nombre_imc[i][0] = nd.nextLine();
            System.out.println("Digite el peso del paciente " + (i+1) + ": ");
            pesoEstIMC[i][0] = nd.nextFloat();
            System.out.println("Digite la estaura del paciente " + (i+1) + ": ");
            pesoEstIMC[i][1] = nd.nextFloat();
            nd.nextLine();
            //IMC
            pesoEstIMC[i][2] = imcPaciente(pesoEstIMC[i][0], pesoEstIMC[i][1]);
            //Nivel peso
            nombre_imc[i][1] = nivelPesoPaciente(pesoEstIMC[i][2]);
        }
        for (int i = 0; i < nombre_imc.length; i++) {
            System.out.println(nombre_imc[i][0] + "\t\t" +
                    pesoEstIMC[i][0] + "\t\t" +
                    pesoEstIMC[i][1] + "\t\t" +
                    pesoEstIMC[i][2] + "\t\t" +
                    nombre_imc[i][1]);
        }
    }

    public static Float imcPaciente (float peso, float estatura){
        float imc;

        imc = peso/(estatura*estatura);
        return imc;
    }
    public static String nivelPesoPaciente(float imc){
        String nvpeso = "";
        if (imc < 18.5){
            nvpeso = "Bajo peso";
        }else if (imc < 25){
            nvpeso = "Normal";
        }else if (imc < 30){
            nvpeso = "Sobre peso";
        }else nvpeso = "Obesidad";

        return nvpeso;
    }
}