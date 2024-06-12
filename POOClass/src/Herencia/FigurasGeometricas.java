package Herencia;

public abstract class FigurasGeometricas {
    //Atributos
    private String nombre;
    private byte cantLados;

    //Metodos

    public FigurasGeometricas() {

    }

    public FigurasGeometricas(String nombre, byte cantLados) {
        this.nombre = nombre;
        this.cantLados = cantLados;
    }

    public abstract double areaFigura();
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getCantLados() {
        return cantLados;
    }

    public void setCantLados(byte cantLados) {
        this.cantLados = cantLados;
    }
}
