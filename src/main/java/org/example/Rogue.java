package org.example;

import java.util.ArrayList;

public class Rogue extends Units {
    public int knife=10; //персональный навык персонажа нож 0-10

    public Rogue(String name, int x, int y) {
        super(name, x, y);
        this.knife = knife;
    }

    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {

    }

    @Override
    public String getInfo() {
        return "Разбойник - " + name + " Здоровье-" + health +  " Нож-" + knife + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return knife;
    }
    public String getType(){
        return "Rogue";
    }

    public void addArmed(){
        knife +=1;
    }
}
