package Clase_celular;

public class SimCard {
    private String empresa;
    private long numero;

    //Metodos
    public SimCard(){}
    public SimCard(String empresa, long numero){
        this.empresa = empresa;
        this.numero = numero;
    }
    public void informacionSimCard(){
        System.out.println("Empresa: " + empresa);
        System.out.println("Numero: " + numero);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }
}
