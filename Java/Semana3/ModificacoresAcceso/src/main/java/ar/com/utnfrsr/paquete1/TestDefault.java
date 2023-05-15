package ar.com.utnfrsr.paquete1;

import ar.com.utnfrsr.paquete2.Clase4;

public class TestDefault {
    public static void main(String[] args) {
        //Clase2 clase2 = new Clase2();
        ClaseHija2 claseHija2 = new ClaseHija2();
        claseHija2.atributoDefault = "Cambio desde la Prueba";
        System.out.println("Clase Hija atributo default = " + claseHija2.atributoDefault);

        Clase4 clase4 = new Clase4("Público");
        System.out.println(clase4.getAtributoPrivado());
        clase4.setAtributoPrivado("Cambio");
        System.out.println("Clase 4 atributo privado = " + clase4.getAtributoPrivado());
    }
}
