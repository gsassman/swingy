package game.entity.character;

import Entity.Entity;
import game.*;

public class Character extends Entity {

    protected int atk;
    protected int def;

    Character() {
        super(name, lon, lat, hp);
    }

    public void fight(Character opponent) {
        System.out.println(oppnent.hp); 
    }

    public void run() {
        int r = numGen(0, 10);

        if (r > 5) {
            this.fight(opponent);
        }

    }

    public void setATK_DEF (int xp) {
        this.atk = xp/2;
        this.def = xp/3;
    }

}