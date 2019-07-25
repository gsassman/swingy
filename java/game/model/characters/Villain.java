package game.model.characters;

import game.*;

public class Villain extends Characters {

    protected static String[] villains = {"ROIRRAW", "THGINK", "NAIRABRAB"};
    
    Villain () {
    }

    Villain(String CLASS, int ATK, int DEF, int LON, int LAT) {
        super(CLASS, ATK, DEF, LON, LAT);
    }

    public static void randVillain() {
        
    }
    
    public static void villainGen() {
        int iClass = numGen(0, 2);
        String sClass = villains[iClass];

        int LVL = Hero.getLVL;
        int XP = Hero.getXP;

        /*int ATKMAX = (XP / 10);
        int ATKMIN = (XP / 20);
        int ATK = numGen(ATKMIN , ATKMAX);

        int DEFMAX = (XP / 10);
        int DEFMIN = (XP / 20);
        int DEF = numGen(DEFMIN, DEFMAX);*/

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

        /////////////
        int DEf = 10;
        int ATK = 10;
        /////////////

        int LON = -1;
        while (LON < 0 || LON > BORDER || (LON == (BORDER / 2))) {
            LON = numGen(0, --BORDER);
        }
        
        int LAT = -1;
        while (LAT < 0 || LAT > BORDER || (LAT == (BORDER / 2))) {
            LAT = numGen(0, --BORDER);
        }
        
        Villain(sClass, ATK, DEF, LON, LAT);
    }
}