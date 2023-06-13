import java.util.Scanner;

public class CalculadoraUTN {
    public CalculadoraUTN() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("****** Aplicacion Calculadora ******");
        System.out.println("Digite el valor para el operando1: ");
        var operando1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Digite el valor para el operando2: ");
        var operando2 = Integer.parseInt(entrada.nextLine());
        var resultado = operando1 + operando2;
        System.out.println("Resultado = " + resultado);
    }
}