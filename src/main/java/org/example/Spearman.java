package org.example;

import java.util.ArrayList;

public class Spearman extends Units{
    public int spear = 10; //персональный навык персонажа копья 0-10.

    public Spearman(String name, int x, int y) {
        super(name, x, y);
        this.spear = spear;
    }


    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {

    }
    @Override
    public String getInfo() {
        return "Копейщик - " + name + " Здоровье-" + health  + " Копье-" + spear + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return spear;
    }
    public String getType(){
        return "Spearman";
    }

    public void addArmed(){
        spear +=1;
    }

}
