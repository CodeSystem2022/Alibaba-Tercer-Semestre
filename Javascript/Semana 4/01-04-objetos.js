let x = 10; // variable del tipo primitiva
 console.log(x.length);
console.log('Tipo primitivos');
 // objeto
let persona ={
     nombre: 'Carlos',
     apellido:'Gil' ,
     email: 'cgil@gmail.com',
     edad: 30,
     nombreCompleto:function(){// metodo o funcion en JavaScript
        return this.nombre+' '+this.apellido+' '+this.nombreComple;
     }
 }

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto())
console.log('Ejecutando un objeto');
//Otra forma de acceder a los atributos de un objeto
let person2 = new Object();//Debe crear  u nuevo objeto en memoria
person2.nombreCompleto =  'juan';
person2.direccion = 'Salada 14';
person2.telefono = '5492618282821';
console.log(person2.telefono);
console.log('Creamos un nuevo objeto');
console.log(persona['apellido' ]); // Accedemos como si fuera un arreglo  GIL 
console.log('Usamos el ciclo for in ');
// for in  y accedemos al objeto como si fuera un arreglo
for(propiedad in persona){
    console.log(propiedad);
    console.log(persona[propiedad]);
}
console.log('Cambiamos y eliminamos un error');
persona.apellida = 'Betancud'; // cambiamos dinamicamente un valor del  objeto
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