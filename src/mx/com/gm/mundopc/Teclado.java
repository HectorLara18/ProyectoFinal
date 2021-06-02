package mx.com.gm.mundopc;

public class Teclado  extends  DispositivoEntrada{
    //Atributos
    private int idTeclado;
    private static int contadorTeclados;

    //Constructor
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    //Metodos


    @Override
    public String toString() {
        return "Teclado{" +
                "Marca: " + this.getMarca() +
                " Tipo de Entrada: " + this.getTipoEntrada() +
                " idTeclado: " + this.idTeclado +
                '}';
    }
}
