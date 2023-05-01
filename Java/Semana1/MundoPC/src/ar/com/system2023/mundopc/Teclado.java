package ar.com.system2023.MundoPc;

public class Teclado extends dispositivoEntrada{
    private final int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada,String marca ){
        super(tipoEntrada,marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idTeclado+", "+super.toString()+'}';
    }
}
