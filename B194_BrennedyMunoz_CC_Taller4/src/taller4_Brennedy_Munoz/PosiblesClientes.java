package taller4_Brennedy_Munoz;

import javax.swing.*;

public class PosiblesClientes {
    //Entradas
    protected short cantPosibClient;
    private Cliente[] listaClientes;
    private Vehiculo[] listaVehiculos;

    //Metodos
    public PosiblesClientes (short maxCantPosibClient){
        this.listaClientes = new Cliente[maxCantPosibClient];
        this.listaVehiculos = new Vehiculo[maxCantPosibClient];
    }

    public void incluirPosiblesClientes (Cliente cliente, Vehiculo vehiculo){
        if (this.cantPosibClient < this.listaClientes.length){
            this.listaClientes[cantPosibClient] = cliente;
            this.listaVehiculos[cantPosibClient] = vehiculo;
            this.cantPosibClient++;
        }
    }

    public void informacionCliente(){
        String informacion = "Lista posibles clientes - vehiculos\n";
        for(int i = 0; i < cantPosibClient; i++){
            Cliente cliente = listaClientes[i];
            Vehiculo vehiculo = listaVehiculos[i];
            informacion = informacion+"### Informacion cliente numero: "+(i+1)+" #### \n"+
                    "Nombre: "+cliente.getNombre()+" - Apellido: "+cliente.getApellido()+"\n"+
                    "Genero: "+cliente.getGenero()+" - C.C.:"+cliente.getCc()+"\n"+
                    "Numero celular: "+cliente.getCelular()+"\n"+
                    "Email: "+cliente.getEmail()+"\n"+
                    "Informacion vehiculo de interes\n"+
                    vehiculo.informacionVehiculo() + "\n";
        }
        JOptionPane.showMessageDialog(null, informacion);
    }
}
