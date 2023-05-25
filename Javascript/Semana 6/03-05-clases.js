class Persona{ //por convención se usa mayúscula en el nombre de la clase
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}

let persona1 = new Persona("Juan", "Perez");
console.log(persona1);
let persona2 = new Persona("Carlos", "Lara");
console.log(persona2);