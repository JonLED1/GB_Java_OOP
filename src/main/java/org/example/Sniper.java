package org.example;

import java.util.ArrayList;

public class Sniper extends Units{
    public int bullet = 10; //персональный навык персонажа пули 0-10.

    public Sniper(String name,  int x, int y) {
        super(name, x, y);
        this.bullet = bullet;
    }

    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {

    }

    @Override
    public String getInfo() {
        return "Снайпер - " + name + " Здоровье-" + health + " Пуля-" + bullet
                + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return bullet;
    }
    public String getType(){
        return "Sniper";
    }

    public void addArmed(){
        bullet+=1;
    }
}
