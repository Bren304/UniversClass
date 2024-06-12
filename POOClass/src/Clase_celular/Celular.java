package Clase_celular;

import java.sql.SQLOutput;

public class Celular {
    private String fabricante;
    private String modelo;
    private long imei;
    private Bateria bateria; //Atributo tipo Objeto
    private byte cantSim;
    private SimCard []simCard; //Atributo como arreglo de objetos

    //Metodos
    public Celular(){
        //Composición teniendo en cuenta que celular es dependiente de bateria
        this.bateria = new Bateria();
    }
    public Celular(String fabricante, String modelo, long imei,
                   String refbat, float ampbat, byte maxcantSim){
        this.bateria = new Bateria(refbat, ampbat);
        this.cantSim = 0; //En el momento de fabricación no tiene SimCards
        this.simCard = new SimCard[maxcantSim];
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.imei = imei;
    }
    public void agregarSimCard(SimCard simCard){
        if (this.cantSim < this.simCard.length){
            this.simCard[this.cantSim] = simCard;
            this.cantSim++;
        }
        else{
            System.out.println("No puede agregar más Simcards al celular");
        }
    }
    public void mostrarInformacion(){
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Imei: " + imei);
        this.bateria.InformacionBateria();
        System.out.println("Cantidad Simcard agregadas: " + this.cantSim);
        for (byte i = 0; i < this.cantSim; i++){
            this.simCard[i].informacionSimCard();
        }
    }
}
