//let autos = new Array('Ferrari', 'Renault', 'BMW'); esta es la sintaxis vieja
const autos = ['Ferrari', 'Renault', 'BMW'];
console.log(autos);

//Modificamos los elementos del arreglo 
autos[1] = "volvo"
console.log(autos[1]),


//Agregamos nuevos valores al arreglo 
autos.push("Audi");
console.log(autos);

//otras formas de agregar elementos al arreglo 
autos[autos.length] = 'porche';
console.log(autos);

//Tercera forma de agregar elementos teniendo cuidado
autos[5] = "Renault";
console.log(autos);
