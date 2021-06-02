package mundopc;
import mx.com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 27.0);
        Monitor monitorSamsung = new Monitor("samsung", 32.0);
        Teclado teclado1 = new Teclado("usb","Logitech" );
        Raton raton1 = new Raton("usb", "logitech");
        Computadora computadora1 = new Computadora("Hector", monitorHP, teclado1, raton1);
        Computadora computadora2 = new Computadora("Games", monitorSamsung, teclado1, raton1);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora2);
        orden1.mostrarOrden();
    }
}
