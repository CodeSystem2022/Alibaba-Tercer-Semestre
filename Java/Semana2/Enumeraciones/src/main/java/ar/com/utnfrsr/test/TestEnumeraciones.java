package ar.com.utnfrsr.test;

import ar.com.utnfrsr.enumeraciones.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);//Las enumeraciones se tratan como cadenas
        //ahora no se deben utilizar comillas, se accede a traves del operador de punto
        System.out.println("Continente no. 1: " + ar.com.utnfrsr.enumeraciones.Continentes.AFRICA);
        System.out.println("Nro. de paises en el 1er continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.AFRICA.getPaises());
        System.out.println("Nro. de habitantes en el 1er continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.AFRICA.getHabitantes());
        System.out.println("Continente no. 2: " + ar.com.utnfrsr.enumeraciones.Continentes.ASIA);
        System.out.println("Nro. de paises en el 2do continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.ASIA.getPaises());
        System.out.println("Nro. de habitantes en el 2do continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.ASIA.getHabitantes());
        System.out.println("Continente no. 3: " + ar.com.utnfrsr.enumeraciones.Continentes.EUROPA);
        System.out.println("Nro. de paises en el 3er continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.EUROPA.getPaises());
        System.out.println("Nro. de habitantes en el 3er continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.EUROPA.getHabitantes());
        System.out.println("Continente no. 4: " + ar.com.utnfrsr.enumeraciones.Continentes.AMERICA);
        System.out.println("Nro. de paises en el 4to continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.AMERICA.getPaises());
        System.out.println("Nro. de habitantes en el 4to continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.AMERICA.getHabitantes());
        System.out.println("Continente no. 5: " + ar.com.utnfrsr.enumeraciones.Continentes.OCEANIA);
        System.out.println("Nro. de paises en el 5to continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.OCEANIA.getPaises());
        System.out.println("Nro. de habitantes en el 5to continente: "
                + ar.com.utnfrsr.enumeraciones.Continentes.OCEANIA.getHabitantes());
    }

    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SABADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Septimo dia de la semana");
                break;
            default:
                System.out.println("Dia no valido");
        }
    }
}
