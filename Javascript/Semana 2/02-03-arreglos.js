//let autos = new Array['Ferrari', 'Renault', 'BMW']; ESTA ES LA SINTAXIS VIEJA
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

console.log(autos[0]);
console.log(autos[2]);

for(let i = 0; i < autos.length; i++){
    console.log(i+' : '+autos[i]);
}

//Modificamos los elementos del arreglo
autos[1] = 'Volvo';
console.log(autos[1]);

//Agregamos nuevos valores al arreglo
autos.push('Audi');
console.log(autos);

//Otras formas de agregar elementos al arreglo
autos[autos.length] = 'Porche';
console.log(autos);

//Tercera forma de agregar elementos teniendo CUIDADO
autos[6] = 'Renault';
console.log(autos);


//Como preguntar si es un Arrray o Arreglo
console.log(Array.isArray(autos)); //Dvuelve un booleano

console.log(autos instanceof Array); //Preguntamos si la variable es una instancia de la clase Array

