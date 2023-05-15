
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //Clases envolventes Wraper
        /*
        Clases envolventes de tipo primitivo
        int= la clase envolvente es integer
        long = la clase envolvente float
        double = la clase envolvente Double
        boolean = la clase envolvente Boolean
        byte = la clase envolvente Byte
        char = la clase envolvente Character
        short = la clase envolvente Short
        */
        int enteroPrim = 10; //Tipo primitivo
        System.out.println("enteroPrim = " + enteroPrim);
        Integer entero = 10;// tipo objet
        System.out.println("entero = " + entero.doubleValue()); //Autoboxing
        
        int entero2 = entero; //Unboxing
        System.out.println("entero2 = " + entero2);
    }
}
