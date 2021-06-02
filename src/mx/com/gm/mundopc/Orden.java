package mx.com.gm.mundopc;

public class Orden {
    //Atributos
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;


    //Constyructor
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadoras < Orden.MAX_COMPUTADORAS){
            this.computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("se a superado el maximo de productos: " + Orden.MAX_COMPUTADORAS);
        }
    }

    public void mostrarOrden(){
        System.out.println("Orden: #" + this.idOrden);
        System.out.println("Computadoras: de la orden: #" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++){
            System.out.println(this.computadoras[i].toString());
        }
    }
}
