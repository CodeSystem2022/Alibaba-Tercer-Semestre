package domain;

public enum TipoEscritura {
    CLASICO ("Escritura a mano"),
    MODERIO ("Escritura digital");
     
    private final String descripcion;

    private TipoEscritura(String descripcion){//Constructor 
        this.descripcion =  descripcion;
    }
//Método get
    public String getDescripcion() {
        return this.descripcion;
    }

}
