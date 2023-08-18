class Asiento:
    def __init__(self, color, precio, registro):
        self.color = color
        self.precio = precio
        self.registro = registro
    
    def cambiarColor(self, color):
        colores =  [ "rojo", "verde", "amarillo", "negro", "blanco" ]
        if (color in colores):
            self.color = color

class Motor:
    def __init__(self, numeroCilindros, tipo, registro):
        self.numeroCilindros = numeroCilindros
        self.tipo = tipo
        self.registro = registro
        
    def cambiarRegistro(self, registro):
        self.registro = registro
        
    def asignarTipo(self, tipo):
        if (tipo == "electrico" or tipo == "gasolina"):
            self.tipo = tipo
            
    def cantidadAsientos(self):
        return 1
        
    def verificarIntegridad(self):
        return 1
        
        
    

class Auto:
    cantidadCreados = 0
    def __init__(self):
        self.modelo
        self.precio
        self.asientos
        self.marca
        self.motor
        pass
