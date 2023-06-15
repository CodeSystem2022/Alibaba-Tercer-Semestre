class Empleado extends Persona{
    static contadorEmpleados = 0;

    constructor(nombre, apellido, edad, sueldo){
        super(nombre, apellido,edad);
        this._idEmpleado  = ++ Empleado.contadorEmpleados;
        this._sueldo = sueldo; 

    }
    // Solo agregamos el get para el id empleado
    get idEmpleado(){
        return this.idEmpleado;
    }
    get sueldo(){
        this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }
    // davanzamos con la clase toString
    toString(){ // heredamos el toString de la clase padre
        return `
        ${super.toString()} 
        ${this._idEmpleado} 
        ${this._sueldo}`;

    }
}
