package mx.com.gm.test;

import mx.com.gm.mundopc.Computadora;
import mx.com.gm.mundopc.Monitor;
import mx.com.gm.mundopc.Raton;
import mx.com.gm.mundopc.Teclado;

public class TestComputadora {
    public static void main(String[] args) {

        Monitor monitor1 = new Monitor("Samsung", 27.0);
        Teclado teclado1 = new Teclado("usb", "logitech");
        Raton raton1 = new Raton("usb", "logitech");

        Computadora computadora1 = new Computadora("Hector", monitor1, teclado1, raton1);
        System.out.println(computadora1.toString());
    }
}
