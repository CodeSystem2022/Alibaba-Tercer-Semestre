from capa_datos_persona.Persona import Persona
from capa_datos_persona.conexion import Conexion
from logger_base import log


class PersonaDao:
    '''
    DAO significa : DATA Acces Object
    CRUD significa:
                Creaate --> insertar
                Read ---> Seleccionar
                Update ---> Actualizar
                Delete----> Eliminar
    '''
    SELECCIONAR  ='SELECT * FROM persona ORDER BY id_persona'
    INSERTAR = 'INSERT INTO persona(nombre,apellido,email) VALUES (%s,%s,%s)'
    ACTUALIZAR= 'UPDATE persona SET nombre=%s,apellido=%s,email=%s WHERE id_persona=%s'
    ELIMINAR= 'DELETE FROM persona WHERE id_persona=%s'

    #definimos los metodos de clase
    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls.SELECCIONAR)
                registros = cursor.fetchall()
                personas = [] #creamos una lista
                for registro in registros:
                    persona= Persona(registro[0],registro[1],registro[2],registro[3])
                    personas.append(persona)
                return personas
    @classmethod
    def insertar(cls,persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores=(persona.nombre,persona.apellido,persona.email)
                cursor.execute(cls.INSERTAR,valores)
                log.debug(f'Persona insertada:{persona}')
                return cursor.rowcount
    @classmethod
    def actualizar(cls,persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores=(persona.nombre,persona.apellido,persona.email,persona.id_persona)
                cursor.execute(cls.ACTUALIZAR,valores)
                log.debug(f'Persona actualizada{persona}')
                return cursor.rowcount
    @classmethod
    def eliminar(cls,persona):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                valores=(persona.id_persona,)
                cursor.execute(cls.ELIMINAR, valores)
                log.debug(f'los objetos eliminados son:{persona}')
                return cursor.rowcount

if __name__=='__main__':
    #eliminar un registro
    #persona1=Persona(id_persona=5)
    #personas_eliminadas=PersonaDao.eliminar(persona1)
    #log.debug(f'personas eliminadas{personas_eliminadas}')

    #actualizar un registro
    #persona1= Persona(1,'Juan Jose','Pena','jjpena@mail.com')
    #personas_actualizadas= PersonaDao.actualizar(persona1)
    #log.debug(f'personas actualziadas{personas_actualizadas}')
    # insertar un registro
    #persona1=Persona(nombre='Omero',apellido='Ramos',email='omeror@mail.com')
    #personas_insertadas=PersonaDao.insertar(persona1)
    #log.debug(f'personas insertadas:{personas_insertadas}')

    #seleccionar objetos
    personas= PersonaDao.seleccionar()
    for persona in personas:
        log.debug(persona)