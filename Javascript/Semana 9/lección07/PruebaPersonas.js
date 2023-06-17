class Persona{
    static contadorPersonas=0;

constructor(nombre,apellido,edad){
    this.idPersona=++Persona.contadorPersonas;
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
}
get idPersona(){
    return this._idPersona;
}

set idPersona(idPersona){
    this._idPersona=idPersona;
}

get nombre(){
    return this._nombre;
}
set nombre(nombre){
    this._nombre=nombre;
}   
get apellido() {
    return this._apellido;
}

set apellido(apellido){
    this._apellido=apellido;
}

get edad(){
    return this._edad;
}

set edad(edad){
    this._edad=edad;
}   
toString(){
    return `
    ${this._idPersona}${this._nombre}  ${this._apellido} ${this._edad}`;


    }
}
class Empleado extends Persona{
    static contadorEmpleados=0;
    constructor(nombre,apellido,edad,sueldo){
        super(nombre,apellido,edad);   
                this.idEmpleado=++Empleado.contadorEmpleados;
                this.sueldo=sueldo;                                           
    }
    get idEmpleado(){   
        return this._idEmpleado;
    }
    set idEmpleado(idEmpleado){
        this._idEmpleado=idEmpleado;
    }
    get sueldo(){
            return this._sueldo;
        }
    set sueldo(sueldo){
            this._sueldo=sueldo;
        }
     toString(){
                return ` ${super.toString()} ${this._idEmpleado} ${this._sueldo}`;
        }


}
class Cliente extends Persona{
    static contadorClientes=0;

    constructor(nombre,apellido,edad,fecharegistro){
        super(nombre,apellido,edad);
        this.idCliente=++Cliente.contadorClientes;
        this.fecharegistro=fecharegistro;
    }
    get idCliente(){
            return this._idCliente;
        }
    
    set idCliente(idCliente){
        this._idCliente=idCliente;
        }
    get fecharegistro(){
                return this._fecharegistro;
            }
    set fecharegistro(fecharegistro){
                    this._fecharegistro=fecharegistro;
                }
    toString(){
        return `
        ${super.toString()} ${this._idCliente}${this._fecharegistro}`;
    }

}
// prueba clase persona
let persona1=new Persona('Juan','Perez',32);
console.log(persona1.toString());
let persona2=new Persona('Carla','Ortega',22);
console.log(persona2.toString());

//Prueba clase empleado
let empleado1=new Empleado('Pedro','Roman' ,18,5000);
console.log(empleado1.toString());

let empleado2=new Empleado('Jonas','Torres' ,30,7000);
console.log(empleado2.toString());  
// prueba clase Cliente
let cliente1= new Cliente('Miguel','Zala',29,new Date());
console.log(cliente1.toString());    

let cliente2= new Cliente('Natalia','Ortega',22,new Date()); 
console.log(cliente2.toString());   