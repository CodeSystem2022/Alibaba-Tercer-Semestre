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
    _SELECCIONAR  ='SELECT * FROM persona ORDER BY id_persona'
    _INSERTAR = 'INSERT INTO persona(nombre,apellido,email) VALUES (%s,%s,%s)'
    _ACTUALIZAR= 'UPDATE persona SET nombre=%s,apellido=%s,email=%s WHERE id_persona=%s'
    _ELIMINAR= 'DELETE FROM persona WHERE id_persona=%s'

    #definimos los metodos de clase
    @classmethod
    def seleccionar(cls):
        with Conexion.obtenerConexion():
            with Conexion.obtenerCursor() as cursor:
                cursor.execute(cls._SELECCIONAR)
                registros = cursor.fetchall()
                personas = [] #creamos una lista
                for registro in registros:
                    persona= Persona(registro[0],registro[1],registro[2],registro[3])
                    personas.append(persona)
                return personas
  
if __name__=='__main__':

    #seleccionar objetos
    personas= PersonaDao.seleccionar()
    for persona in personas:
        log.debug(persona)