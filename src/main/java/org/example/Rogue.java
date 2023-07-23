package org.example;

import java.util.ArrayList;

public class Rogue extends Units {
    public boolean knife; //персональный навык персонажа нож есть/нет;

    public Rogue(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
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

    @Override
    public void step(ArrayList<Units> units) {

    }

    @Override
    public String getInfo() {
        return "Разбойник - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Нож-" + knife
                + " x="+coord.x + ", y=" + coord.y;
    }

}
