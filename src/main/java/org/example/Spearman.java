package org.example;

import java.util.ArrayList;

public class Spearman extends Units{
    public int spear; //персональный навык персонажа копья 0-10.

    public Spearman(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
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

    @Override
    public void step(ArrayList<Units> units) {

    }

    @Override
    public String getInfo() {
        return "Копейщик - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Копье-" + spear
                + " x="+coord.x + ", y=" + coord.y;
    }

}
