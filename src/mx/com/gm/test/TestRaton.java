package mx.com.gm.test;

import mx.com.gm.mundopc.Raton;

public class TestRaton {
    public static void main(String[] args) {
        Raton raton1 = new Raton("usb", "logitech");
        System.out.println(raton1.toString());
    }
}
