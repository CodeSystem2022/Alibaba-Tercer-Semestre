#Declaramos una variable y vamos a necesitar un metodo, el metodo open
#el open nos sirve para abrir un archivo o para crearlo.
try:
    archivo = open ('prueba.txt', 'w') #La w es de Write
    archivo.write('Programamos con diferentes tipos de archivos, ahora en txt.\n')
    archivo.write('Los acentos son importantes para las palabras\n')
    archivo.write('como por ejemplo: acción, ejecución y producción\n')
    archivo.write('las letras:\nr read leer, \na append anexa, \nw write escribe, \nx crea un archivo')
    archivo.write('\nt esta es para texto o text,\nb archivos binarios, \nw lee y escribe son iguales r+\n')
    archivo.write('Con esto terminamos')
except Exception as e:
    print(e)
finally: #siempre se ejecuta
    archivo.close() # con esto se debe cerrar el archivo, aunque tenga error

    print('Fin del archivo')
    # archivo.write('nueva info')