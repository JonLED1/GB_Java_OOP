package org.example;

public class Crossbowman extends Units{
    public int arrow;

    public Crossbowman(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
        this.arrow = arrow;
    }

    public int checkArrow(){
        return arrow;
    }
    public int setArrow(int n){
        this.arrow +=n;
        if (arrow<0) arrow =0;
        return arrow;
    }
}
