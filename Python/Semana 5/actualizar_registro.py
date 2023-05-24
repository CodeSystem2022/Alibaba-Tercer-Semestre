import psycopg2 # Librería para conectarse a la BD de PostgreSQL

conexion = psycopg2.connect(user='postgres', password='root', host='127.0.0.1', port='5432', database='test_bd')

try:
    with conexion:
        with conexion.cursor() as cursor:
            sentencia = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
            valores = ('Juan Carlos', 'Roldan', 'rccarlos@mail.com', 1) # Es una tupla
            cursor.execute(sentencia, valores) # Ejecutar sentencia SQL
            registros_actualizados = cursor.rowcount
            print(f'Los registros actualizados son: {registros_actualizados}')

except Exception as e:
    print(f'Ocurrió un error: {e}')
finally:
    conexion.close()