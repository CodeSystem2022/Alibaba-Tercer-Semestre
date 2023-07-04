from capa_datos_persona.Persona import Persona
from capa_datos_persona.conexion import Conexion
from capa_datos_persona.cursor_del_pool import CursorDelPool
from logger_base import log


class personaDAO:
    """"
    DAO significa: Data Access Object
    CRUD significa:
                    Create -> Insertar
                    Read ->Seleccionar
                    Update ->Actualizar
                    Delete -> Eliminar
    """
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_Persona'
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %s)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    # Definimos los métodos de clase
    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
            cursor.execute(cls._SELECCIONAR)
            registros = cursor.fetchall()
            personas = []  # creamos una lista
            for registro in registros:
                persona = Persona(registro[0], registro[1], registro[2], registro[3])
                personas.append(persona)
            return personas

    @classmethod
    def insertar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email)
            cursor.execute(cls._INSERTAR, valores)
            log.debug(f'persona Insertada: {persona}')
            return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
            cursor.execute(cls._ACTUALIZAR, valores)
            log.debug(f'Persona actualizada: {persona}')
            return cursor.rowcount

    @classmethod
    def eliminar(cls, persona):
        with CursorDelPool() as cursor:
            valores = (persona.id_persona,)
            cursor.execute(cls._ELIMINAR, valores)
            log.debug(F'Los  objetos eliminados son: {persona}')
            return cursor.rowcount


if __name__ == '__main__':
    # Eliminar un registro
     persona1 = Persona(id_persona=18)
     personas_eliminadas = personaDAO.eliminar(persona1)
     log.debug(F'Personas eliminadas: {personas_eliminadas}')

    # Actualizar un registro
     persona1 = Persona(1, 'Juan jose', 'Pena', 'jpena@mail.com')
     personas_actualizadas = personaDAO.actualizar(persona1)
     log.debug(f'Personas actualizadas: {personas_actualizadas}')

    # Insertar un registro
     persona1 = Persona(nombre='Mateo', apellido='Torres', email='tmateo@mail.com')
     personas_insertadas = personaDAO.insertar(persona1)
     log.debug(f'Personas insertadas: {personas_insertadas}')

    # Seleccionamos objetos
     personas = personaDAO.seleccionar()
     for persona in personas:
        log.debug(persona)
