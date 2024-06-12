package Clase_celular;

public class Bateria {
    private String refBat;
    private float ampBat;

    //Metodos
    public Bateria(){}
    public Bateria(String refBat, float ampBat){
        this.refBat = refBat;
        this.ampBat = ampBat;
    }
    public void InformacionBateria(){
        System.out.println("Referencia batería: " + refBat);
        System.out.println("Amperaje bateria: " + ampBat);
    }


}
