class Persona{
    constructor(nombre,apellido){
        this._nombre=nombre;
        this._apellido=apellido;

    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre=nombre;
    }
}


let persona1= new Persona('Martín','Perez');
console.log(persona1._nombre);
persona1.nombre='Juan Carlos';
console.log(persona1.nombre)
//console.log(persona1);
let persona2= new Persona('Carlos','Lara');
console.log(persona2._nombre);
persona2.nombre='Maria Laura';
console.log(persona2._nombre)
//console.log(persona2);