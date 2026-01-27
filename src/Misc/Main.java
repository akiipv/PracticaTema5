package Misc;

import Characters.*;
import Combat.Combate;
import GameMap.*;
import Misc.GameTest;

public class Main {
    public static void main(String[] args) {
        // Que luego dices que no pruebo lo que hago, hater 🥀

        Personaje Isa = new Cazador("Isa", 7, 15, 63, 2, 30, 21, "felino", "ale");
        Personaje Alejandro = new Mago("Alejandro", 9, 23, 42, 36, 22, 23, 24);

        Combate.combatir(Isa, Alejandro);
    }
}