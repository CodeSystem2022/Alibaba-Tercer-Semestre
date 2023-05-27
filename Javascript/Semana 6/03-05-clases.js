//let persona3 = new Persona('Carla', 'Ponce'); Esto no se debe hacer: Persona is not defined

class Persona{ //Clase padre
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }

    get nombre(){
        return this._nombre; 
    }
    set nombre(nombre){
        this._nombre = nombre;
    }

    get apellido(){
        return this._apellido; 
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}

class Empleado extends Persona{ //Clase hija
    constructor(nombre, apellido, departamanto){
        super(nombre, apellido);
        this._departamanto = departamanto;
    }

    get _departamento(){
        return this._departamanto;
    }

    set departamanto(departamanto){
        this._departamento = departamanto;
    }
}

let persona1 = new Persona('Martín', 'Perez');
console.log(persona1.nombre);
persona1.nombre = 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);

let persona2 = new Persona('Carlos', 'Lara');
console.log(persona2.nombre);
persona2.nombre = 'María Laura';
console.log(persona2.nombre);
//console.log(persona2);

console.log(persona1.apellido);
persona1.apellido = 'Gimenez';
console.log(persona1.apellido);
//console.log(persona1);

console.log(persona2.apellido);
persona2.apellido = 'Sanchez';
console.log(persona2.apellido);
//console.log(persona2);

let empleado1 = new Empleado('María', 'Gimenez', 'Sistema');
console.log(empleado1);
console.log(empleado1.nombre);