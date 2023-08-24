//package taller3.televisores.



class Marca {

    String nombre;

    Marca(String nombre) {
        this.nombre = nombre;
    }

    String get() {
        return this.nombre;
    }

    void set(String nombre){
        this.nombre = nombre;
    }
}


class TV {

    private Marca marca;
    private int canal = 1;
    private int precio = 500;
    private boolean estado;
    private int volumen = 1;
    private Control control;
    public static int numTV = 0;

    TV (Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;        
    }

    //Metodos get y set de cada atributo



    //
    void turnOn() {
        this.estado = true;
    }

    void turnOff() {
        this.estado = false;
    }
    
    boolean getEstado() {
        return this.estado
    }


    //Volumen y Canal Up/Down


    //Canal
    void canalUp(){
        if (this.canal < 120 && this.estado) {
            this.canal += 1
        }
    }

    void canalDown(){
        if (this.canal > 1 && this.estado) {

        }
        this.canal -= 1
    }

    void setCanal(int canal) {
        this.canal = canal
    }



    //Volumen
    void volumeUp(){
        if (this.volumen < 7 && this.estado) {
            this.volumen += 1
        }    
    }

    void volumeDown(){
        if (this.volumen > 0 && this.estado) {
            this.volumen -= 1
        }
    }

    void setVolumen(int volumen){
        this.volumen = volumen
    }
}


class Control {
    TV tv;


    void turnOff() {
        this.tv.turnOff();   
    }
    void turnOn(){
        this.tv.turnOn();
    }

    void canalUp() {
        this.tv.canalUp();
    }
    void canalDown() {
        this.tv.canalDown();
    }
    void volumenUp() {
        this.tv.volumeUp();
    }
    void volumenDown() {
        this.tv.volumeDown();
    }



    //Enlazar y set
    void setCanal(int canal) {
        this.tv.setCanal(canal);
    }
    void setVolumen(int volumen) {
        this.tv.setVolumen(volumen);
    }

    void enlazar(Tv tv) {
        this.tv = tv
        this.tv.setControl(this);
    }
}

