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