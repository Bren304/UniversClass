package taller4_Brennedy_Munoz;

public class Vehiculo {
    //Entradas
    private String marca, modelo;
    protected byte cantLlantas;
    protected Llanta []llantas;

    //Metodos

    public Vehiculo() {

    }

    public Vehiculo(String marca, String modelo, byte maxCantLlantas) {
        this.marca = marca;
        this.modelo = modelo;
        this.llantas = new Llanta[maxCantLlantas];
    }

    public void agregarLlanta(Llanta llanta){
        if (this.cantLlantas < this.llantas.length){
            this.llantas[cantLlantas] = llanta;
            this.cantLlantas++;
        }
    }

    public String informacionVehiculo(){
        String informacion = "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nCantidad de llantas: " + cantLlantas;
        for (int i = 0; i < cantLlantas; i++) {
            Llanta llanta = llantas[i];
            informacion = informacion+"\n" + llanta.informacionLlanta();
        }
        return informacion;
    }
}
