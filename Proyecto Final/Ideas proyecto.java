//maximo 9 clases
//5 funcionalidades


/*
... Hay q cambiar el nombre de pokemones para q sea mas divertido y creativo ...

Tener una clase grande que es la q corre todo el programa, la clase Game
- Hay nivel de dificultad q altera los valores de el juego, por ejemplo multiplicadores

- Dentro del juego se le puede pedir crear un pokemon

- Clase jugador, el cual hara las acciones y tiene atributos como inventario y mochila con un array de pokemones
- Clase pokemon, q tiene varios metodos  y hace varias cosas
-- Dependiendo de cierta probabilidad y el nivel de vida se podra atrapar un pokemon --


- Dentro de cada pokemon y jugador se inicializa una clase de animaciones, puede mostrar el nombre, texto y algunsa visuales


- Hay un inventario del jugador donde puede recolectar objetos y esos los puede usar en los pokemones, quieto, y en batalla? o simpemente trofeos???


- INventario de pokemones y curar cierto pokemon, ademas se puede imprimir la lista de los nombres de pokemones existentes en el inventario de pokemones



CLASE JUGADOR:
- Jugar y atacar
- Caminar por fuera, se pueden encontrar objetos y pokemones (Si encuentra una batalla puede luchar o correr)
- Manejar el inventario, mejorar pokemones y conseguir en objetos
*/





class Game {
    //nivel de dificultad

    Game(nombre, numero Pokemon?, ) {
        Game.jugador = new Jugador(nombre)
    }


    //Crear Un pokemon
    void crearpoke() {

        //genera los numeros aleatorios
                
        //return Pokemon?

    }


    void setdificultad(1,2,3){
        //set dificultad
    }
}


class Visuales y mensajes {

    void atacar {
    }
    void curar {
    }
    //Mensajes de pokemones, jugador...etc
}


class inventariopokemones {
    //atributo privado de array
}

class inventario {
    //atributo privado de array
}


class Pokemon {

    //Atributos,
    //- Tipo, apodo
    //Multiplicador de daño?

    //movimientos

    //pOkemon autoataque, numero rndom y ejecuta movimiento


    //Encerrar en pokebola, varios tipos de metodos segun lo q se quiere hacer
    void atacar(){}

    void defender(){}

    void esquivar()

    
}

class Jugador {
    //atributo nombre

    //Inventario
    //Pokemones

    //jugador carminar
    //jugador curar, entrenar o x pokemon (Aleatorio q suma o resta nivel de habilidad?)
}
