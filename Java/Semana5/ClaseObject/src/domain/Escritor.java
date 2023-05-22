
package domain;


public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
public Escritor (String nombre,double sueldo,TipoEscritura tipoEscritura){
    super(nombre,sueldo);
    this.tipoEscritura=tipoEscritura;
}

// metodo para sobreescribir

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles()+",tipo escritura:"+tipoEscritura.getDescripcion();              // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString(){
        return "Escritor (" +"tipoEscrituras="+tipoEscritura +"y"+""+super.toString();
        
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }
    
}

