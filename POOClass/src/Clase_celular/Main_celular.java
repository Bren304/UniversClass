package Clase_celular;

public class Main_celular {
    public static void main(String[] args) {
        //Llamadar o invocar las clases del diagrama

        //Declaro e instancio un objeto de Celular
        System.out.println("----------------------------");
        Celular celular = new Celular();
        celular.mostrarInformacion();
        System.out.println("----------------------------");
        //Creo objeros de la clase SimCard
        SimCard simCard1 = new SimCard("Movistar", 3154669143L);
        SimCard simCard2 = new SimCard("Wom", 3234704353L);
        SimCard simCard3 = new SimCard("Tigo", 3197527452L);

        Celular cel1 = new Celular("Apple", "iPhone10", 6425341673L,
                "baterik", 5000f, (byte) 1);
        Celular cel2 = new Celular("Xiaomi", "Redmi Note 11", 6235236323L,
                "bat2621", 5020f, (byte) 2);

        cel2.agregarSimCard(simCard1);
        cel2.agregarSimCard(simCard2);
        cel1.agregarSimCard(simCard3);
        cel1.mostrarInformacion();
        System.out.println("-------");
        cel2.mostrarInformacion();
    }
}
