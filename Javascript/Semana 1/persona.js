// Definición de la clase Persona
class Persona {
  constructor(nombre, edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  toString() {
    return `Nombre: ${this.nombre}, Edad: ${this.edad}`;
  }

  static contador_personas = 0;

  static generar_siguiente_valor() {
    Persona.contador_personas++;
  }
}

// Función para mostrar los valores en el navegador
function mostrarValores(valor) {
  document.write(valor + "<br>");
}

// Crea instancias de Persona y muestra los valores en el navegador
let persona1 = new Persona('Raul', 60);
mostrarValores(persona1.toString());

let persona2 = new Persona('Samuel', 15);
mostrarValores(persona2.toString());

let persona3 = new Persona('Lisa', 9);
mostrarValores(persona3.toString());

Persona.generar_siguiente_valor();

let persona4 = new Persona('Maria', 70);
mostrarValores(persona4.toString());

Persona.generar_siguiente_valor();

let persona5 = new Persona('Marta', 13);
mostrarValores(persona5.toString());

Persona.generar_siguiente_valor();

let persona6 = new Persona('Julieta', 5);
mostrarValores(persona6.toString());

Persona.generar_siguiente_valor();

let persona7 = new Persona('Juan', 90);
mostrarValores(persona7.toString());

// Muestra el valor actual del contador de personas en el navegador
mostrarValores(`Valor contador personas: ${Persona.contador_personas}`);
