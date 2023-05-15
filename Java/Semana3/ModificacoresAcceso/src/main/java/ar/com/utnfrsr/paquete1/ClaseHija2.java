package ar.com.utnfrsr.paquete1;

public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDefault = "Modificación del atributo default";
        System.out.println("Atributo default = " + this.atributoDefault);
        this.metodoDefault();
    }
}
