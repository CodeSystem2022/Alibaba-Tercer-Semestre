from manejoArchivos import manejoArchivos

# manejo de contexto with: sintaxis simplificada
#with open('prueba.txt', 'r', encoding='utf8') as archivo:
    #print(archivo.read())
# no hace falta ni try ni finally
#en el with se ejecuta automaticamente el __enter__ este abre y hay otro que es el __exit__

with manejoArchivos('prueba.txt') as archivo:
    print(archivo.read())