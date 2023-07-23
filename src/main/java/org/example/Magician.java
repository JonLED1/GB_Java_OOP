package org.example;

import java.util.ArrayList;

public class Magician extends Units{
    public int magic; //персональный навык персонажа магия 0-3.

    public Magician(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
        this.magic = magic;
    }

    public int checkMagic(){
        return magic;
    }
    public int setMagic(int n){
        this.magic +=n;
        if (magic<0) magic =0;
        return magic;
    }

    @Override
    public void step(ArrayList<Units> units) {

    }

    @Override
    public String getInfo() {
        return "Маг - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Магия-" + magic
                + " x="+coord.x + ", y=" + coord.y;
        }

}
