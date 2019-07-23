package entity;

import game.*;

public class Villain extends Character {

    private int atk;
    private int def;

    Villain() {
        super("Villain", numGen(0, maxLon), numGen(0, maxLon), 10);

        this.atk = numGen(0, (getLvl() * 2));
        this.def = numGen(0, (getLvl() * 2));
    }
}