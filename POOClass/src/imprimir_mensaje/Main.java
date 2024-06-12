package imprimir_mensaje;

public class Main {
    public static void main(String[] args) {
        //Para atributos y métodos estáticos
        ImprimirMensaje.funMensaje1();

        //Para atributos y métodos dinámicos
        //Declarar un objeto de la clase
        ImprimirMensaje imprimirMensaje;
        //Instanciar el objeto creado
        imprimirMensaje = new ImprimirMensaje();
        imprimirMensaje.funMnesaje2();

        //Declarar e instanciar otro objeto
        ImprimirMensaje obj2 = new ImprimirMensaje();
    }
}
