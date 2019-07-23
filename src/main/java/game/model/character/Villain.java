package game.model.character;

import game.*;

public class Villain extends Character {

    protected static String[] villains = {"ROIRRAW", "THGINK", "NAIRABRAB"};
    Villain () {
    }

    Villain(String CLASS, int ATK, int DEF, int LON, int LAT) {
        super("Villain", numGen(0, maxLon), numGen(0, maxLon), 10);

        this.atk = numGen(0, (getLvl() * 2));
        this.def = numGen(0, (getLvl() * 2));
    }
}