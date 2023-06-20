import java.util.Scanner;

public class calculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        while (true){ //Ciclo infinito
            System.out.println("****** Aplicación Calculadora ******");
            mostrarMenu();
            try{
                var operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4){
                    ejecutarOperacion(operacion, entrada);
                } //Fin del if
                else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break; //Rompe el ciclo y sale
                }
                else {
                    System.out.println("Opción Erronea"+operacion);
                }
                //Imprimimos un salto de linea para repetir el menú
                System.out.println(3);
            } catch (Exception e){ //Fin del try comienzo del catch
                System.out.println("Ocurrió un error: "+ e.getMessage());
                System.out.println();
            } //Fin cathc
        } //Fin While
    } //Fin main

    private static void mostrarMenu(){
        //Mostramos el menú
        System.out.println("""
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir            
                    """);
        System.out.print("Operación a realizar? ");
    } //Fin método mostrarMenu

    private static void ejecutarOperacion(int operacion, Scanner entrada){
        System.out.print("Digite el valor para el operando 1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Digite el valor para el operando 2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());
        double resultado;

        switch (operacion){
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicación: " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado de la división: " + resultado);
            }
            default -> System.out.println("Opción Erronea: " + operacion);

        } //Fin del Switch
    }//Fin método ejecutarOperacion
} //Fin clase

