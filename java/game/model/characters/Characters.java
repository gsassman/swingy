package game.model.characters;

import game.*;

import java.lang.Math;

public class Characters {

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

    public void setATK_DEF (int XP) {
        this.ATK = XP/2;
        this.DEF = XP/3;
    }

    public static int numGen(int MIN, int MAX){
        return ((int)Math.random() * (MAX - MIN));
    }

}

/*
package game.entity.artefacts;

import game.entity;

public class artefacts extends Entity{
    
    private static String[] artefacts = {"Weapon", "Armour", "Helm"};
    
    artefact() {
        super(name, lon, lat, hp);
        
        int a = numGen(0, artefacts.length);
        new artefact(artefacts[a], numGen(0, maxlon), numGen(0, maxlon), numGen(0, 20));
    }

    artefact(String name, int lon, int lat, int hp) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;
        this.hp = lat;
    }
}
*/


