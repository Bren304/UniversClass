import java.util.Scanner;

public class EjerJuan {
    public static void main(String[] args) {
        String nom_alumno;
        double materia1, materia2, materia3, materia4, materia5, materia6, resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese el nombre del alumno");
        nom_alumno = entrada.nextLine();
        System.out.println("Ingrese la nota 1");
        materia1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2");
        materia2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3");
        materia3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4");
        materia4 = entrada.nextDouble();
        System.out.println("Ingrese la nota 5");
        materia5 = entrada.nextDouble();
        System.out.println("Ingrese la nota 6");
        materia6 = entrada.nextDouble();
        resultado = ((materia1 + materia2 + materia3 + materia4 + materia5 + materia6)/6);
        System.out.println("El alumno " + nom_alumno + " tiene una nota de " + resultado);
    }
}