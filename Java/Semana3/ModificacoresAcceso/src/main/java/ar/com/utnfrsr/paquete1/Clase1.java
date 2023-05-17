package ar.com.utnfrsr.paquete1;

public class Clase1 {
    public String atributoPublico = "Valor atributo público";
    protected String atributoProtegido = "Valor atributo protegido";

    public Clase1() {
        System.out.println("Constructor público");
    }
    protected Clase1(String atributoPublico) {
        System.out.println("Constructor protegido");
    }

    public void metodoPublico() {
        System.out.println("Método público");
    }
    protected void metodoProtegido() {
        System.out.println("Método protegido");
    }
}
