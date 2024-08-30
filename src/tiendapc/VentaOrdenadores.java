package tiendapc;

import tiendapc.model.Monitor;
import tiendapc.model.Pc;
import tiendapc.model.Raton;
import tiendapc.model.Teclado;
import tiendapc.service.Pedido;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class VentaOrdenadores {
    public static void main(String[] args) {
    Raton ratonLogitech = new Raton("inalámbrico", "Logitech");
    Teclado tecladoRK = new Teclado("USB-C", "Royal Kludge");
    Monitor monitorSamsung = new Monitor("Samsung", 27);
    Pc pcMSI = new Pc("MSI Katana", monitorSamsung, tecladoRK, ratonLogitech);

        //Creacion de pedido
        Pedido pedido1 = new Pedido();
        pedido1.agregarPc(pcMSI);
        pedido1.mostrarPedido();
    }
}