public class Arreglos {
    public static void main(String[] args) {
        //ejemplo de vectores
        String [] vector = {"Hola", "Mundo", "UTS", "FPOO", "Curso", "B194"};
        System.out.println("Tamaño del vector: " + vector.length);

       for (byte i=0; i < vector.length; i++) {
           System.out.println("Vector[" + i + "] = " + vector[i]);
       }
       System.out.println("--------------------------------------");
       for (String iterable : vector) {
           System.out.println("iterable = " + iterable);
       }
        System.out.println("-------------------------------------");
       //Declarar vector
       byte [] vector2;
       //Intanciar el vector (Reservar un espacio en la memoria)
        vector2 = new byte[10];

        for (byte i = 0; i < vector2.length; i++){
            System.out.println("vector2[" + i + "] = " + vector2[i]);
        }
        System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        for (byte i = 0; i < vector2.length; i++){
            //Por defecto "1" es tipo double
            vector2[i] = (byte)(i+1);
            System.out.println("vector2[" + i + "] = " + vector2[i]);
        }
    }
}

