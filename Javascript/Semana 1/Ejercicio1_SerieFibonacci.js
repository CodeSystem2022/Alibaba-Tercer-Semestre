// Este programa muestra los primeros 10 numeros de la serie de Fibonacci
let n1 = 0, n2 = 1, nextTerm;

console.log("Los primeros 10 números de la serie de Fibonacci son:");

for (let i = 1; i <= 10; i++) {
    console.log(n1);
    nextTerm = n1 + n2;
    n1 = n2;
    n2 = nextTerm;
}