package Herencia;

public class Cuadrado extends FigurasGeometricas{
    //Atributos
    private double lado;

    //Metodos
    public Cuadrado(){

    }

    public Cuadrado(String nombre, byte cantLados, double lado){
        super(nombre, cantLados);
        this.lado = lado;
    }

    @Override
    public double areaFigura(){
        return Math.pow(this.lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
