package org.example;

public class Spearman extends Units{
    public int spear;

    public Spearman(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
        this.spear = spear;
    }

    public int checkSpear(){
        return spear;
    }
    public int setSpear(int n){
        this.spear +=n;
        if (spear<0) spear = 0;
        return spear;
    }
}
