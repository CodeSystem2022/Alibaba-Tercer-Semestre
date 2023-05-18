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
