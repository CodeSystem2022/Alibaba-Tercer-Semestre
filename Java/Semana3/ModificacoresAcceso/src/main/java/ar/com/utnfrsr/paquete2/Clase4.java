package ar.com.utnfrsr.paquete2;

public class Clase4 {
    private String atributoPrivado = "Valor atributo privado";

    private Clase4(){
        System.out.println("Constructor privado");
    }

    //Creamos un constructor public para poder crear objetos de esta clase
    public Clase4(String atributoPrivado){
        this();
        System.out.println("Atributo privado = " + this.atributoPrivado);
    }

    //Método privado
    private void metodoPrivado(){
        System.out.println("Método privado");
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
}
