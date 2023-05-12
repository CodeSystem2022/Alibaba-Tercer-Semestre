// Creacion de array o arreglos
//let autos = new Array('Ferrari','Renault','BMW'); ESTA ES LA SINTAXIS VIEJA
const autos = ['Ferrari','Renault','BMW'];
console.log(autos)

//recorremos los elementos de un arreglo

console.log(autos[0]);
console.log(autos[2]);

for(let i= 0; i<autos.length;i++){
    console.log(i+ ': '+ autos[i]);
}
// modificamos los elementos del arreglo

autos[1] = 'Volvo';
console.log(autos[1])

// agregamos nuevos valores
autos.push('Audi');
console.log(autos);

// Otra forma de agregar elementos al arreglo
autos[autos.length]='Porche';
console.log(autos)

// tercer forma de agregar elementos teienedo cuiddado
autos[50] ='Renault';
console.log(autos)

// como preguntar si es un array o arreglo
console.log(Array.isArray(autos)); // Devuelve un booleano


console.log(autos instanceof Array) //preguntamos si la variable es una instancia de la clase array
