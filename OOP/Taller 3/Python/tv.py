
class TV:
    _numTV = 0

    def __init__(self, marca, estado):
        self._marca = marca
        self._canal = 1
        self._precio = 500
        self._estado = estado
        self._volumen = 1
        TV._numTV+= 1


    def setMarca(self, marca):
        self._marca = marca
    

    def setCanal(self, canal):
        if ((canal < 121 and canal > 0) and self._estado == True):
            self._canal = canal
    

    def setPrecio(self, precio):
        self._precio = precio


    def setVolumen(self, volumen):
        if (volumen <= 7 and volumen >= 0 and self._estado == True):
            self._volumen = volumen
    
    def setControl(self, control):
        self._control = control
    

    def getMarca(self):
        return self._marca
    

    def getCanal(self):
        return self._canal
    

    def getPrecio(self):
        return self._precio
    

    def getVolumen(self):
        return self._volumen
    
    def getControl(self):
        return self._control
    

    #------------------------------
    @classmethod
    def setNumTV(cls, num):
        cls._numTV = num

    @classmethod
    def getNumTV(cls):
        return cls._numTV
    
    #------------------------------

    #------------------------------
    def turnOn(self):
        self._estado = True
    

    def turnOff(self):
        self._estado = False
    
    def getEstado(self):
        return self._estado
    
    #------------------------------

    #------------------------------
    #Canal
    def canalUp(self):
        if (self._canal < 120 and self._estado == True):
            self._canal += 1
        
    def canalDown(self):
        if (self._canal > 1 and self._estado == True):
            self._canal -= 1
    

    #Volumen
    def volumenUp(self):
        if (self._volumen < 7 and self._estado == True):
            self._volumen += 1
            

    def volumenDown(self):
        if (self._volumen > 0 and self._estado == True):
            self._volumen -= 1
    #------------------------------

