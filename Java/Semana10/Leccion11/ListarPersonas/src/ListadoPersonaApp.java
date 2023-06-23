import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonaApp {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //Definimos la lista fuera del ciclo while
        List<Persona> personas = new ArrayList<>();
        //Empezamos con el menú
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(entrada, personas);
            } catch (Exception e){
                System.out.println("Ocurrio un error: "+e.getMessage());
            }
            System.out.println();
        }//Fin del ciclo while
    }//Fin metodo main

    private static  void  mostrarMenu(){
        //mostramos las opciones
        System.out.print("""
                ******* Listado de Personas *******
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Digite una de las opciones: ");
    }//Fin método mostrarMenu

    private static boolean ejecutarOperacion(Scanner entrada, List<Persona> personas){
        var opcion = Integer.parseInt(entrada.nextLine());
        var salir = false;
        //Revisamos la opción digitada a través de un switch
        switch (opcion){
            case 1 -> {
                //Agregar una persona a la lista
                System.out.print("Digite el nombre de la persona: ");
                var nombre = entrada.nextLine();
                System.out.print("Digite el telefono de la persona: ");
                var tel = entrada.nextLine();
                System.out.print("Digite el correo de la persona: ");
                var email = entrada.nextLine();
                //Creamos el objeto persona
                var persona = new Persona(nombre, tel, email);
                //Agregamos la persona a la lista
                personas.add(persona);
                System.out.println("La lista tiene " + personas.size() + " elementos");
            } //Fin del caso 1
            case 2 -> {
                //Listamos las personas
                System.out.println("Listado de personas");
                //Mejoras con lamda y el método de referencia
                //personas.forEach((persona) -> System.out.println(persona));
                personas.forEach(System.out::println);
            } //Fin del caso 2
            case 3 -> {
                //Salimos del ciclo
                System.out.println("Gracias por usar el programa");
                salir = true;
            } //Fin del caso 3
            default -> System.out.println("Opción Incorrecta " + opcion);
        }//Fin del switch
        return salir;
    }//fin del método ejecutarOperacion
}//Fin de la clase ListadoPersonasApp
