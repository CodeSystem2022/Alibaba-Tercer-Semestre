class Cliente extends Persona{
    static contadorClientes = 0;

    constructor(nombre, apellido, edad, fecharesgistro){
        super(nombre, apellido, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fechaResgistro = fecharesgistro;
    }
    get idCliente(){
        return this._idCliente;
    }
    get fecharesgistro(){
        return this._fechaResgistro
    }
    set fecharesgistro(fecharesgistro){
        this._fechaResgistro = fecharesgistro;
    }
    toString(){
       return `
        ${super.toString()} 
        ${this._idCliente} 
        ${this._fechaRegistro}`;
    }
}
