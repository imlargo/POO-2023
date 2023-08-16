class Main {

  public static void main(String[] args) {

    Asiento asiento = new Asiento();
    asiento.precio = 10;
    System.out.println(asiento.precio);
    asiento.cambiarColor("rojo");
    System.out.println(asiento.color);

  }
}

class Asiento {
  String color;
  int precio;
  int registro;

  void cambiarColor(String color) {
    switch (color) {
      case "rojo":
        this.color = "rojo";
        break;
      case "verde":
        this.color = "verde";
        break;
      case "amarillo":
        this.color = "amarillo";
        break;
      case "negro":
        this.color = "negro";
        break;
      case "blanco":
        this.color = "blanco";
        break;
      default:
        break;
    }
  }
}

class Auto {

  static int cantidadAsientos() {
    return 1;
  }
  static String verificarIntegridad() {
    return "1";
  }
  String modelo;
  int precio;
  Asiento[] asientos;
  String marca;
  Motor motor = new Motor();
  

  int registro;

  int cantidadCreados;
}

class Motor {}
