package ar.com.utnfrsr.paquete2;

import ar.com.utnfrsr.paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3() {
        super("Protected");
        this.atributoProtegido = "Accedemos desde la clase hija";
        System.out.println("Atributo protegido = " + this.atributoProtegido);
        this.atributoPublico = "Es totalmente público";
        this.metodoProtegido();
    }
}
