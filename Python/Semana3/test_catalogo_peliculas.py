from Semana3.Pelicula import Pelicula
from Semana3.catalogo_peliculas import CatalogoPeliculas as ctp
opcion = None
while opcion != 4:
    try:
        print('Opciones: ')
        print('1. Agregar Pelicula')
        print('2. Listar las pelicula')
        print('3. Eliminar catálogo de peliculas')
        print('4. Salir')
        opcion = int(input('Digite una opción de menú (1-4): '))
        if opcion == 1:
            nombre_pelicula = input('Digite el nombre de la pelicula: ')
            pelicula = Pelicula(nombre_pelicula)
            ctp.agregar_peliculas(pelicula)
        elif opcion == 2:
            ctp.listar_peliculas()
        elif opcion == 3:
            ctp.eliminar_peliculas()
    except Exception as e:
        print(f'Ocurrió un error de tipo: {e}')
        opcion = None
    else:
        print('Salimos del programa . . .')
