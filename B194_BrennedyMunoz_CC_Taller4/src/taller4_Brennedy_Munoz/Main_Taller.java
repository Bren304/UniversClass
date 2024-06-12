package taller4_Brennedy_Munoz;

public class Main_Taller {
    public static void main(String[] args) {
        //Crear informacion
        Cliente cli1 = new Cliente("Pablo", "Bernal", "pberna@gmail.com", 'M', 29324263, 606612412);
        Vehiculo veh1 = new Vehiculo("Ford", "2025", (byte)4);
        Cliente cli2 = new Cliente("Juancho", "Corto", "juacor@gmail.com", 'M', 6235252, 612513422);
        Vehiculo veh2 = new Vehiculo("Renault", "4", (byte)4);
        veh1.agregarLlanta(new Llanta("Michelin", 30f, 30f, 3f));
        veh2.agregarLlanta(new Llanta("Mitio", 29f, 29f, 9f));
        PosiblesClientes pc = new PosiblesClientes((byte)8);
        pc.incluirPosiblesClientes(cli1, veh1);
        pc.incluirPosiblesClientes(cli2, veh2);

        pc.informacionCliente();
    }
}
