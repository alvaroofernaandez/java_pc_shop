package tiendapc.service;

import tiendapc.model.Pc;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int idPedido;
    private final List<Pc> pcs;
    private static int contadorPedidos;

    //Constructores
    public Pedido() {
        pcs = new ArrayList<>();
        this.idPedido = ++contadorPedidos;
    }

    public void agregarPc(Pc pc) {
        pcs.add(pc);
    }

    public void mostrarPedido(){
        System.out.println("---> PEDIDO #:" + idPedido);
        System.out.println("Total ordenadores comprados: " + pcs.size());
        System.out.println();
        pcs.forEach(System.out::println);
    }

}
