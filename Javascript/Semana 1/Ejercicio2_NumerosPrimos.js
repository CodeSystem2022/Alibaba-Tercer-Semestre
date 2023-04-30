//Este programa muestra los primeros 10 números primos 
function esPrimo(numero) {
  for (let i = 2; i < numero; i++) {
    if (numero % i === 0) {
      return false;
    }
  }
  return true;
}

let contador = 0;
let numero = 2;

while (contador < 10) {
  if (esPrimo(numero)) {
    console.log(numero);
    contador++;
  }
  numero++;
}