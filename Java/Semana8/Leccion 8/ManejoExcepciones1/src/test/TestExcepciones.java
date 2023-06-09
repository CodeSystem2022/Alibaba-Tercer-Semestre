
package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        resultado = division(10, 0);
        System.out.println("La variable de resultado tiene como valor: " + resultado);
    }
}
