archivo = open ('prueba.txt', 'r',encoding="utf8")
#print(archivo.read())

print(archivo.read(16))
print(archivo.read(10)) #continuamos desde la linea anterior
print (archivo.readline())

