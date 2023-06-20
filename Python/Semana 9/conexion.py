import psycopg2 as bd
# psycopg2 as db otra manera de importar el psycopg2
from logger_base import log
import sys

class Conexion:
    _DATABASE = 'test_bd'
    _USERNAME = 'postgres'
    _PASSWORD = 'admin'
    _BD_PORT = '5432'
    _HOST = '127.0.0.1'
    _conexion = None
    _cursor = None

    @classmethod
    def obtenerConexion(cls):
        if cls._conexion is None:
            try:
                cls._conexion =  bd.connect(host=cls._HOST,
                                            user=cls._USERNAME,
                                            password=cls._PASSWORD,
                                            port=cls._BD_PORT,
                                            database=cls._DATABASE)
                log.debug(f'Conexion Exitosa: {cls._conexion}')
                return cls._conexion
            except Exception as e:
                log.error(f'Ocurrio un error: {e}')
                sys.exit()
        else:
            return cls._conexion



    @classmethod
    def obtenerCursor(cls):
        if cls._cursor is None:
            try:
                cls._cursor = cls.obtenerConexion().cursor()
                log.debug(f'Se abrio correctamente el cursor: {cls._cursor}')
                return cls._cursor
            except Exception as e:
                log.error(f'Ocurrio un error: {e}')
                sys.exit()
        else:
             return cls._cursor

if __name__ == ' __main__ ':
    Conexion.obtenerConexion()
    Conexion.obtenerCursor()
