class Producto{
    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }

    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }

    get precio(){
        return this._precio;
    }
    
    set precio(precio){
        this._precio = precio;
    }

    toString(){ //Template Literals: nos permite insertar código dinamicamente
        return `idProducto: ${this._idProducto}, nombre: ${this._nombre}, precio: $${this._precio}  `;
    }
}

let producto1 = new Producto('Pantalón', 200);
let producto2 = new Producto('Camisa', 100);
console.log( producto1.toString() );
console.log( producto2.toString() );
