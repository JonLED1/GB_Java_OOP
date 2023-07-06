package org.example;

public class Rogue extends Units {
    public boolean knife; //персональный навык персонажа нож есть/нет;

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

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Разбойник - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Нож-" + knife
                + " ["+place_xy[0] + "," + place_xy[1] + "]";
    }

}
