public class EjemploFuncionies_SPar_SRet {

    public static void saludarCurso(){
        String est = "Uteístas";
        System.out.println("Holas " + est);
        System.out.println("Curso fundamento de POO");
        System.out.println("Grupo B194");
        lugarClase();
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        //Función principal donde se ejecuta el programa
        //Aquí llamamos otras funciones
        byte x = 6;
        System.out.println("x = " + x);

        //Llamar función
        saludarCurso();

        float y = 10;

        System.out.println("y = " + y);
        saludarCurso();
        saludarCurso();
        saludarCurso();

    }
    public static void lugarClase(){
        System.out.println("Edificio A");
        System.out.println("Lunes y miércoles");
        System.out.println("Aula 304A");
    }
}