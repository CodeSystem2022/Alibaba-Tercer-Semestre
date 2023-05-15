package ar.com.utnfrsr.paquete1;

class Clase2 extends Clase1 {
    String atributoDefault = "Valor del atributo default";

    /*Clase2() {
        System.out.println("Constructor default");
    }*/

    public Clase2(){
        super();
        this.atributoDefault = "Modificación del atributo default";
        System.out.println("Atributo default = " + this.atributoDefault);
        this.metodoDefault();
    }

    void metodoDefault() {
        System.out.println("Método default");
    }
}
