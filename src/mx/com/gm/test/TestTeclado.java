package mx.com.gm.test;

import mx.com.gm.mundopc.Teclado;

public class TestTeclado {
    public static void main(String[] args) {
        Teclado teclado1 = new Teclado("usb", "Logitech");
        System.out.println(teclado1.toString());
    }
}
