package Misc;

import Characters.*;
import Combat.Combate;
import GameMap.*;
import Misc.GameTest;

public class Main {
    public static void main(String[] args) {
        // Que luego dices que no pruebo lo que hago, hater 🥀

        Personaje Isa = new Cazador("Isa", 2, 2, 2, 2, 2, 2, "canido", "ale");
        Personaje Alejandro = new Ladrón("Alejandro", 2, 3, 4, 3, 2, 1);

        Isa.realizarTurno(Alejandro);
        /*Alejandro.realizarTurno(Isa);*/
        Isa.subirNivel();
    }
}