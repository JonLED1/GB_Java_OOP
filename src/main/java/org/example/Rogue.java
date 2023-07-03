package org.example;

public class Rogue extends Units {
    public boolean knife;

    public Rogue(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
        this.knife = knife;
    }

    public boolean checkKnife(){
        if (knife) return true;
        return false;
    }
    public boolean setKnife(){
        this.knife =true;
        return true;
    }


}
