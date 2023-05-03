// Este programa genera una matriz de 5x5 con numeros aleatorios y los ordena en orden descendente
var matriz = [];
for (var i = 0; i < 5; i++) {
  var fila = [];
  for (var j = 0; j < 5; j++) {
    fila.push(Math.floor(Math.random() * 100));
  }
  matriz.push(fila);
}

console.log("Matriz original:");
for (var i = 0; i < matriz.length; i++) {
  console.log(matriz[i].join("\t"));
}

for (var i = 0; i < matriz.length; i++) {
  for (var j = 0; j < matriz[i].length - 1; j++) {
    if (matriz[i][j] < matriz[i][j + 1]) {
      var temp = matriz[i][j];
      matriz[i][j] = matriz[i][j + 1];
      matriz[i][j + 1] = temp;
    }
  }
}

console.log("Matriz ordenada:");
for (var i = 0; i < matriz.length; i++) {
  console.log(matriz[i].join("\t"));
}