package mx.com.despacho;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        //primero tenemos que crear los objetos basicos para formar una PC
        Monitor monitorDell = new Monitor("Salida", "DELL", 15);
        Teclado tecladoDell = new Teclado("Entrada", "DELL");
        Raton ratonDell = new Raton("Entrada", "DELL");
        Computadora computadora1 = new Computadora("Computadora DELL", monitorDell, ratonDell, tecladoDell);
        //hacemos una orden
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }
}
