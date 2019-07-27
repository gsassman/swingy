package game.model.characters;

import game.*;
import java.lang.Math;

public class Characters {

    protected int HP;
    protected int LON;
    protected int LAT;
    protected int ATK;
    protected int DEF;
    protected String CLASS;
   
    Characters() {
    }

    Characters(String CLASS, int ATK, int DEF, int LON, int LAT) {
        this.CLASS = CLASS;
        this.ATK = ATK;
        this.DEF = DEF;
        this.LON = LON;
        this.LAT = LAT;
    }

    public static int numGen(int MIN, int MAX){
        return ((int)Math.random() * (MAX - MIN));
    }
}



