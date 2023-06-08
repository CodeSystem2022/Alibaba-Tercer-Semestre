//Let persona3 = new Persona('Carla', ' Ponce'); esto no se debe hacer: Persona is no...

class Persona{ //Clase padre

    static contadorPersonas = 0;//Atributo estático
    //email = 'Valor default email'; // Atributo No estático

    static get MAX_OBJ(){ //método que simula una constante
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if(Persona.contadorPersonas < Persona.MAX_OBJ){
         this.idPersona = ++Persona.contadorPersonas;   
        }
        else{
            console.log('Se ha superado el máximo de objetos permitidos');
        }
        
        //console.log('Se incrementa el contador a: '+Persona.contadorObjetosPersona);
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
    nombreCompleto(){
        return this.idPersona+' '+this._nombre+' '+ this._apellido;//corregido
    }
    //Sobreescribiendo  el método de la clase padre (Object)
    toString(){  //Regresa un String
        //Se aplica el polimorfismo que significa = multiples formas en tiempo de ejecución
        //El método que se ejecuta depende si es una referencia  de tipo padre o hija
        return this.nombreCompleto();
    }
  //Se asocia a la clase y no a los objetos
  static saludar(){
        console.log('Saludos desde este método static');
    }
    static saludar2(persona){ //
        console.log(persona.nombre+' '+ persona.apellido);
    }
}
class Empleado extends Persona{ // Clase hija 
    constructor(nombre, apellido, departamento){//corregido
        super(nombre, apellido);
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento;
    }
    set departamento(departamento){
        this._departamento = departamento;
    }
    //Sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() +' '+ this._departamento;
    }
}
let persona1 = new Persona('Martin','Perez');
console.log(persona1.nombre);
persona1.nombre= 'Juan Carlos';
console.log(persona1.nombre);
//console.log(persona1);
let persona2 = new Persona('Carlos','Lara');
console.log(persona2.nombre);
persona2.nombre= 'María Laura';
console.log(persona2.nombre);
//console.log(persona2);
let empleado1 = new Empleado('María', 'Gimenez', 'Sistemas');
console.log(empleado1);
console.log(empleado1.nombreCompleto());
//Object.prototype.toString Esta es la manera de acceder a atributos y métodos de ..
console.log(empleado1.toString());
console.log(persona1.toString());
//persona1.saludar(); no se utiliza desde el objecto
Persona.saludar();
Persona.saludar2(persona1);
Empleado.saludar();
Empleado.saludar2(empleado1);

console.log(Persona.contadorObjetosPersona);
console.log(Empleado.contadorObjetosPersona);

console.log(persona1.email);
console.log(empleado1.email);
//console.log(Persona.email); No puede acceder desde la clase

console.log(persona1.toString());
console.log(persona2.toString());
console.log(empleado1.toString());
console.log(Persona.contadorPersonas);
let persona3 = new Persona('Carla', 'Pertosi');
console.log(persona3.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
// persona.MAX_OBJ = 10; no se puede modificar ni alterar

let persona4 = new Persona('Franco', 'Diaz');
console.log(persona4.toString());
let persona5 = new Persona('Liliana', 'Paz');
console.log(persona5.toString());