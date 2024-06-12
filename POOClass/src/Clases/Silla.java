package Clases;

public class Silla {

    //Atributos - Características
    public String material;
    protected String color;
    private byte cant_patas;
    float peso;
    public float alto, ancho, profundidad;
    private boolean disponible;

    //Metodos - Funciones
    public boolean sentarse(){
        boolean sent;

        //Tranformación
        if (this.disponible){
            disponible = false;
            sent = true;
        }else{
            sent = false;
        }
        //Salida
        return sent;
    }
    public boolean  levantarse(){
        boolean levant;

        //Tranformación
        if(!disponible){
            this.disponible = true;
            levant = true;
        }else{
            levant = false;
        }
        //salida
        return levant;
    }
}
