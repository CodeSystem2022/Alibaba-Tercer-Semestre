# Declaramos una variable
from _ast import arg

try:
    archivo = open('prueba.txt', 'w', encoding='utf8') #la w es de write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('Las letras son:\n r: read, \n a: append, \n w: write, \n x: crea un archivo \n')
    archivo.write(' t: text,\n b: archivos binarios, \n w+: escribe y lee. \n')
    archivo.write('Saludos a todos los alumnos de la tecnicatura\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: # siempre se ejecuta
    archivo.close() # esto debe cerrar el archivo
# archivo.write('esto es un error, no se puede escribir una vez finalizado el archivo')