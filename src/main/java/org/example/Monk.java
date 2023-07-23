package org.example;

import java.util.ArrayList;

public class Monk extends Units{
    public int recover; //персональный навык персонажа способность восстановления здоровья персонажей 0-10.

    public Monk(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
        this.recover = recover;
    }

    public int checkRecover(){
        return recover;
    }
    public int setRecover(int n){
        this.recover +=n;
        if (recover<0) recover =0;
        return recover;
    }

    @Override
    public void step(ArrayList<Units> units) {

    }

    @Override
    public String getInfo() {
        return "Монах - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Восстановление-" + recover
                + " x="+coord.x + ", y=" + coord.y;
    }
}
