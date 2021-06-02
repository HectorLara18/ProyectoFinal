package mx.com.gm.mundopc;

public class Raton extends DispositivoEntrada {
    //Atributos
    private int idRaton;
    private static int contadorRatones;

    //Constructor
    public Raton(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "Marca: " + this.getMarca() +
                " Tipo de Entrada: " + this.getTipoEntrada() +
                " idRaton: " + idRaton +
                '}';
    }
}
