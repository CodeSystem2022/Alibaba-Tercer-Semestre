
package domain;

public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor (String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super (nombre, sueldo);
        this. tipoEscritura =tipoEscritura;
    }


//Método para sobreescribir
    @Override
    public String obtenerDetalles () {
        return super.obtenerDetalles()+", Tipo Escritura: "+tipoEscritura.getDescripcion();
    }
    
    @Override
    public String toString() {
        return "Escritor{" + "topoEscritura=" + tipoEscritura + '}'+ " "+super.toString();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
