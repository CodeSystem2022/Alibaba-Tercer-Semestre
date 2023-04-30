// Escucha el evento de clic en el botón con id "miBoton"
document.getElementById("miBoton").addEventListener("click", function() {
   // Función para convertir grados Celsius a Fahrenheit
  function celsiusToFahrenheit(celsius) {
    return (celsius * 9/5) + 32;
  }
   // Función para convertir grados Fahrenheit a Celsius
  function fahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5/9;
  }
  // Solicitar al usuario un valor en grados Celsius y convertirlo a Fahrenheit
  let celsius = parseFloat(prompt("Digite el valor en grados Celsius: "));
  let result = celsiusToFahrenheit(celsius);
  alert(celsius + " °C a °F: " + result.toFixed(2));
   // Solicitar al usuario un valor en grados Fahrenheit y convertirlo a Celsius
  let fahrenheit = parseFloat(prompt("Digite el valor en grados Fahrenheit: "));
  result = fahrenheitToCelsius(fahrenheit);
  alert(fahrenheit + " °F a °C: " + result.toFixed(2));
});
