import psycopg2 # Librería para conectarse a la BD de PostgreSQL

conexion = psycopg2.connect(
    user='postgres',
    password='root',
    host='127.0.0.1',
    port='5432',
    database='test_bd'
)

#print(conexion)

# Crear cursor para ejecutar sentencias SQL en PostgreSQL
cursor = conexion.cursor()
sentencia = 'SELECT * FROM persona'
cursor.execute(sentencia) # Ejecutar sentencia SQL
registros = cursor.fetchall() # Obtener todos los registros de la consulta
print(registros)

# Cerrar cursor
cursor.close()