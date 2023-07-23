package org.example;

import java.util.ArrayList;

public class Sniper extends Units{
    public int bullet; //персональный навык персонажа пули 0-10.

    public Sniper(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
        this.bullet = bullet;
    }

    public int checkBullet(){
        return bullet;
    }
    public int setBuleet(int n){
        this.bullet +=n;
        if (bullet<0) bullet = 0;
        return bullet;
    }

    @Override
    public void step(ArrayList<Units> units) {

    }

    @Override
    public String getInfo() {
        return "Снайпер - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Пуля-" + bullet
                + " x="+coord.x + ", y=" + coord.y;
    }

}
