from Persona import Persona
from conexion import Conexion
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
    _SELECCIONAR = 'SELECT * FROM persona ORDER BY id_Personar'
    _INSERTAR = 'INSERT INTO persona(nombre, apellido, email) VALUES (%s, %s, %S)'
    _ACTUALIZAR = 'UPDATE persona SET nombre=%s, apellido=%s, email=%s WHERE id_persona=%s'
    _ELIMINAR = 'DELETE FROM persona WHERE id_persona=%s'

    # Definimos los métodos de clase
    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = []  # creamos una lista
                for registro in registros:
                    persona = Persona(registro[0], registro[1], registro[2], registro[3])
                    personas.append(persona)
                return personas

    @classmethod
    def insertar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email)
                cursor.execute(cls._INSERTAR, valores)
                log.debug(f'persona Insertada: {persona}')
                return cursor.rowcount

    @classmethod
    def actualizar(cls, persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores = (persona.nombre, persona.apellido, persona.email, persona.id_persona)
                cursor.execute(cls._ACTUALIZAR, valores)
                log.debug(f'Persona actualizada: {persona}')
                return cursor.rowcount


if __name__ == '__main__':
    # Actualizar un registro
    persona1 = Persona(1, 'Juan jose', 'pena', 'jjpena@mail.com')
    personas_actualizadas = personaDAO.actualizar(persona1)
    log.debug(f'Personas actualizadas: {personas_actualizadas}')

    #Insertar un registro
    #persona1 = Persona(nombre = 'Omero', apellido= 'Ramos',email= 'omeror@mail.com')
    #personas_insertadas = personaDAO.insertar(persona1)
    #log.debug(f'Personas insertadas: {personas_insertadas}')

    # Seleccionamos objetos
personas = personaDAO.seleccionar()
for persona in personas:
    log.debug(persona)
