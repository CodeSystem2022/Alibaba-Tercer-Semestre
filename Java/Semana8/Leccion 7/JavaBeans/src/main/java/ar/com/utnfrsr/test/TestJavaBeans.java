package ar.com.utnfrsr.test;

import ar.com.utnfrsr.domain.Persona;

public class TestJavaBeans {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        System.out.println("Persona = " + persona);

        System.out.println("Persona Nombre: " + persona.getNombre());
        System.out.println("Persona Apellido: " + persona.getApellido());

        //El tema de los Beans es para que se puedan usar en diferentes tecnologias
        //como por ejemplo en JSP, JSF, etc.
        //En JSP se puede usar con Expression Language (EL) para acceder a los atributo de un Bean.
        //En JSF se puede usar con Expression Language (EL) para acceder a los atributo de un Bean.
        //La implementación de Serializable es para que se pueda guardar en un archivo, en una base de datos, etc.
        //es decir que el contenido de un Bean se pueda persistir.
        //Ya que el mismo se almacena en 0 y 1, lo que se vuvelve facil de retransmitir por la red.
    }
}
