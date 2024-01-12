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

  String modelo;
  int precio;
  Asiento[] asientos;
  String marca;
  Motor motor;
  int registro;
  public static int cantidadCreados;

  int cantidadAsientos() {
    int cont = 0;
    for (var asiento : this.asientos) {
      if (asiento instanceof Asiento) {
        cont += 1;
      }
    }
    return cont;
  }

  String verificarIntegridad() {
    String mensaje = "Auto original";

    for (Asiento asiento : this.asientos) {
      if (asiento != null) {
        if (asiento.registro != this.registro) {
          mensaje = "Las piezas no son originales";
        }
      }
    }

    if (motor.registro != this.registro) {
      mensaje = "Las piezas no son originales";
    }

    return mensaje;
  }
}

class Motor {
  int numeroCilindros;
  String tipo;
  int registro;

  void cambiarRegistro(int registro) {
    this.registro = registro;
  }

  void asignarTipo(String tipo) {
    if (tipo == "electrico") {
      this.tipo = "electrico";
    }
    if (tipo == "gasolina") {
      this.tipo = "gasolina";
    }
  }
}