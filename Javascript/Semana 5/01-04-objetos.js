let x = 10; //variable de tipo primitiva
console.log(x.length);

console.log("Tipos Primitivos");
//Objeto
let persona = { //se le asigna un espacio en memoria al objeto
    nombre: "Juan",
    apellido: "Perez",
    email: "jperez@gmail.com",
    edad: 28,
    idioma: "ES",
    get lang(){
        return this.idioma.toUpperCase(); //toUpperCase convierte a mayusculas las letras minusculas
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    nombreCompleto: function(){ //metodo o función en JavaScript
        return this.nombre + " " + this.apellido; //this hace referencia al objeto
    },
    get nombreEdad(){ //get es una palabra reservada para obtener un valor
        return "El nombre es: "+this.nombre + ", Edad: " + this.edad;
    }
    
}

console.log(persona.nombre);
console.log(persona.apellido);
console.log(persona.email);
console.log(persona.edad);
console.log(persona);
console.log(persona.nombreCompleto());

console.log("Ejecutando con un objeto")
//Otra forma de acceder a los atributos de un objeto
let persona2 = new Object(); //Debe crear un nuevo objeto en memoria
persona2.nombre = "Carlos";
persona2.direccion = "Saturno 15";
persona2.tel = "55443322";
console.log(persona2.tel);

console.log("Creamos un nuevo objeto");
console.log(persona["apellido"]); //Accedemos como si fuera un arreglo

console.log("Utilizando el metodo for in");
//for in
for (nombrePropiedad in persona){  //nombrePropiedad es una variable que se crea en tiempo de ejecución
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}

console.log("Cambiando y eliminando propiedades a un objeto");
//Agregar propiedades a un objeto
persona.apellido = "Carballo"; //Ya existe la propiedad tel, solo se modifica
console.log(persona);

//Eliminar una propiedad
console.log(persona.tel);
persona.tel = "65432134"; //Creamos la propiedad tel
console.log(persona.tel);
delete persona.tel;
console.log(persona.tel); //eliminamos la propiedad tel

//Distintas formas de imprimir un objeto
//Número 1: la más sencilla: concatenar cada valor de cada propiedad
console.log("Distintas formas de imprimir un objeto forma 1: ");
console.log(persona.nombre + ", " + persona.apellido + ", " + persona.email + ", " + persona.edad);

//Número 2: Utilizando un ciclo for in
console.log("Distintas formas de imprimir un objeto forma 2: ");
for (nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//Número 3: Utilizando el método Object.values(objeto)
console.log("Distintas formas de imprimir un objeto forma 3: ");
let personaArray = Object.values(persona);
console.log(personaArray);

//Número 4: Utilizando el método JSON.stringify(objeto)
console.log("Distintas formas de imprimir un objeto forma 4: ");
let personaString = JSON.stringify(persona);
console.log(personaString);

//Usamos el metodo get
console.log("Usamos el metodo get");
console.log(persona.nombreEdad);

console.log("Usamos el metodo get para Idiomas");
console.log(persona.lang);

//Usamos el metodo set
console.log("Usamos el metodo set para Idiomas");
persona.lang = "en";
console.log(persona.lang);

function Persona3(nombre, apellido, email){ //Función constructor
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.nombreCompleto = function(){
        return this.nombre + " " + this.apellido;
    }
}
let padre = new Persona3("Juan", "Perez", "jperez@gmail.com"); //new crea un nuevo objeto
padre.nombre = "Carlos";//modificamos el valor de la propiedad nombre
console.log(padre.nombreCompleto()); //Utilizamos el método nombreCompleto
console.log(padre);

let madre = new Persona3("Laura", "Quintero", "lquintero@gmail.com");
console.log(madre);
console.log(madre.nombreCompleto());

//Uso de protitype
Persona3.prototype.telefono = '256487961';
console.log(padre);
console.log(madre.telefono);
madre.telefono= '654656154';
console.log(madre.telefono);

//Uso de call
let persona4 = {
    nombre: 'Juan',
    apellido: 'Perez',
    nombreCompleto2: function(titulo, telefono){
        return titulo+': ' + this.nombre + ' '+ this.apellido+ ' '+telefono;
        //return this.nombre+' '+this.apellido;
    }
}

let persona5 = {
    nombre: 'Carlos',
    apellido: 'Lara'
}

console.log(persona4.nombreCompleto2('Lic.', '549618383834'));
console.log(persona4.nombreCompleto2.call(persona5, 'Ing. ', '5492618585856'));

//Método Apply
let arreglo = ['Ing ', '5492618686865'];
console.log(persona4.nombreCompleto2.apply(persona5, arreglo));
