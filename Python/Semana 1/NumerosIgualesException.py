class NumerosIgualesException(Exception): #extiende de la clase
    def __init__(self,mensaje):
        self.mensaje = mensaje
