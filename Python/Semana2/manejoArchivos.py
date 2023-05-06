class manejoArchivos:
    def __int__(self, nombre):
        self.nombre = nombre

    def __enter__(self):
        print('Obtenemos el recurso'.center(50, '-'))
        self.nombre = open(self.nombre, 'r', encoding='utf8') # encapsulamos el codigo
        return self.nombre

    def __exit__(self, tipo_exception, valor_exception, traza_error):
        print('cerramos el recurso'.center(50, '-'))
        if self.nombre:
            self.nombre.close()