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
    
    public void villainCoordinates(int LVL) {
        
        int BORDER = 0;
        switch (LVL) {
            case 1 :
                BORDER = 9;
                break;
            case 2 :
                BORDER = 15;
                break;
            case 3 :
                BORDER = 19;
                break;
            case 4 :
                BORDER = 25;
                break;
            case 5 :
                BORDER = 35;
                break;
            default :
                BORDER = 50;
                break;
        }

        int LON = numGen(0, --BORDER);
        int LAT = numGen(0, --BORDER);

        this.LON = LON;
        this.LAT = LAT;
    }
}