
package domain;

public enum TipoEscritura {
    CLASICO("escritura a mano"),
    MODERNO("escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){ // constructor
        this.descripcion = descripcion;
        
    }
    // metodo get

    public String getDescripcion() {
        return this.descripcion;
    }
    
}
