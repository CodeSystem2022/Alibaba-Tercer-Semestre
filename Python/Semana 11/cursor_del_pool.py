from logger_base import log
from conexion import Conexion

class CursorDelPool:
    def __init__(self):
        self._conexion = None
        self._cursor = None

    def __enter__(self):
        log.debug('Inicio del método with y --enter--')
        self._conexion = Conexion.obtenerConexion()
        self._cursor = self._conexion.cursor()
        return self._cursor
