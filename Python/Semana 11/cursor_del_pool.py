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

    def __exit__(self, tipo_exeption, valor_exeption, detalle_exeption):
        log.debug(' Se ejecuta el método exit')
        if valor_exeption:
            self._conexion.rollback()
            log.debug(f'Ocurrio una exepción: {valor_exeption}')
        else:
            self._conexion.commit()
            log.debug('commit de la transacción')
        self._cursor.close()
        Conexion.liberarConexion(self._conexion)