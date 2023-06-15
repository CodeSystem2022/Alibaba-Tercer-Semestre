import java.util.Scanner;

public class CalculadoraUTN {
    public CalculadoraUTN() {
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("****** Aplicacion Calculadora ******");
        //Mostramos el Menú
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicación
                4. División
                5. Salir
                """);
        System.out.print("Operación a Realizar: ");
        var operacion = Integer.parseInt(entrada.nextLine());

        if (operacion >= 1 && operacion <= 4) {
            System.out.print("Digite el Valor para el operando1: ");
            var operando1 = Integer.parseInt(entrada.nextLine());
            System.out.print("Digite el Valor para el operando2: ");
            var operando2 = Integer.parseInt(entrada.nextLine());
        int resultado;
            switch (operacion){
                case 1 -> {//Suma
                    resultado = operando1 + operando2;
                    System.out.println("El resultado de la Suma es: " + resultado);
                }
                case 2 -> {//Resta
                    resultado = operando1 - operando2;
                    System.out.println("El resultado de la Resta es: " + resultado);
                }
                case 3 -> {//Multiplicación
                    resultado = operando1 * operando2;
                    System.out.println("El resultado de la Multiplicación es: " + resultado);
                }
                case 4 -> {//División
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de la División es: " + resultado);
                }
                default -> System.out.println("Opción erronea: " + operacion);
            } //Fin del switch
        } //Fin del if
        else if (operacion == 5) {
            System.out.println("Gracias por usar la aplicación");
        } else {
            System.out.println("Opción erronea: " + operacion);
        }
    } //Fin del método main
} //Fin de la clase CalculadoraUTN