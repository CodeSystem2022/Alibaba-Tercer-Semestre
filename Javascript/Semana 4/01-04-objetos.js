let x= 10; // Variable de tipo primitiva
console.log(x.length);
console.log('Tipos Primitivos');
//Objeto
let persona = {
    nombre:'Carlos',
    apellido:'Gil',
    email:'cgil@gmail.com',
    edad:30,
    
    nombreComleto: function () { //metodo
        return this.nombre+' '+this.apellido;
    }
}
console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreComleto());

//Otra forma de acceder a los atributos de un objeto
let persona2 = new Object();
persona2.nombre = "Carlos";
persona2.direccion = "Saturno 15";
persona2.telefono = "55443322";
console.log(persona2.telefono);

console.log(persona['apellido']); //Accedemos como si fuera un arreglo
//for in y accede,ps al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud'; // cambiamos dianmicamente un valor del  objeto
delete persona.apellida;// Eliminamos el error
console.log(persona);

//Distintas formas de imprimir un objeto
// Numero 1: la mas sencilla : concatenar cada  valor de cada propiedad
console.log(persona.nombre+','+persona.apellido);
console.log('Distintas formas de imprimir un objeto: forma 1');

// Numero 2: A travez del coclo for in 
console.log('Distintas formas de imprimir un objeto: forma 2');
for(nombrePropiedad in persona){
    console.log(nombrePropiedad);
        console.log(persona[nombrePropiedad]);
}
// Numero 3: La funcion Objeto.Values()
console.log('Distintas formas de imprimir un objeto: forma 3');
let personaArray = Object.values(persona);
console.log(personaArray);

// Numero 4: Utilizamos el metodo JSON.stringsify
console.log('Distintas formas de imprimir un objeto forma 4');
let personaString = JSON.stringify(persona);
console.log(personaString);


