package tiendapc.model;

public class Pc {
    private int idPc;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorPcs;

    //Constructores
    private Pc() {
        idPc = ++contadorPcs;
    }

    public Pc(String nombre, Monitor monitor, Teclado teclado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    @Override
    public String toString() {
        return "Pc{\n" +
                "idPc=" + idPc + "," +
                "nombre='" + nombre + ",\n" +
                "monitor=" + monitor + ",\n" +
                "teclado=" + teclado + ",\n" +
                "raton=" + raton + ",\n" +
                '}';
    }
}
