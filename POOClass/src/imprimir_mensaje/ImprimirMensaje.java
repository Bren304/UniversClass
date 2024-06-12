package imprimir_mensaje;

public class ImprimirMensaje {
    //Atributos
    private String mensaje;

    //Metodos-Funciones

        //Constuctor
    public ImprimirMensaje(){}
    public ImprimirMensaje(String mensaje){
        this.mensaje = mensaje;
    }
    public static void funMensaje1(){
        System.out.println("Función estática");
    }

    public boolean funMnesaje2(){
        boolean x = true;
        System.out.println("Función dinámica");
        System.out.println("Valor de x = " + x);
        System.out.println("Valor atributo mensaje = " + this.mensaje);
        return x;
    }
}
