package game.model.character;

import game.*;

public abstract class Character {

    protected int LON;
    protected int LAT;
    protected int ATK;
    protected int DEF;
    protected String CLASS;
   

    Character() {
    }

    Character(String CLASS, int ATK, int DEF, int LON, int LAT) {
        this.CLASS = CLASS;
        this.ATK = ATK;
        this.DEF = DEF;
        this.LON = LON;
        this.LAT = LAT;
    }

    

    public void setATK_DEF (int xp) {
        this.ATK = xp/2;
        this.DEF = xp/3;
    }

}

/*
package game.entity;

import game.*;

public class Entity {
    
    protected String name;
    protected int lon;
    protected int lat;
    protected int hp;

    Entity(String name, int lon, int lat, int hp) {
        this.name = name;
        this.lon = lon;
        this.lat = lat;  
        this.hp = hp;
    }

    public static int numGen(int min, int max){
        return ((int)math.random() * (max - min));
    }

    


    while (Game != null) {
        Scanner.read
    }
}*/


/*
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


