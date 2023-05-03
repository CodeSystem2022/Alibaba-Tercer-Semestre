  // Definición de la clase Rectangulo
  class Rectangulo {
    constructor(altura, base) {
      this.altura = altura; // Altura del rectángulo
      this.base = base; // Base del rectángulo
    }

    // Método para calcular el área del rectángulo
    calcularArea() {
      return this.altura * this.base; // Multiplicación de altura por base
    }
  }

  document.getElementById("miBoton2").addEventListener("click", function() {
    // Solicitar al usuario el valor de la base del rectángulo
    const base = parseInt(prompt("Ingrese el valor de la base del rectángulo: "));

    // Solicitar al usuario el valor de la altura del rectángulo
    const altura = parseInt(prompt("Ingrese el valor de la altura del rectángulo: "));

    // Crear una instancia de la clase Rectangulo con los valores proporcionados por el usuario
    const rectangulo = new Rectangulo(base, altura);

    // Calcular el área del rectángulo utilizando el método calcularArea()
    const area = rectangulo.calcularArea();

    // Mostrar el resultado en una ventana de alerta
    alert(`El área del rectángulo es: ${area}`);
  });