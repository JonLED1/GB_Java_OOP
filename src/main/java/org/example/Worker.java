package org.example;

import java.util.ArrayList;

public class Worker extends Units{
    public int tool; //персональный навык персонажа инструмент 0-3. возможность создавать оружие. навык восстанавливается через 3 хода.

    public Worker(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
        this.tool = tool;
    }

    public int checkTool(){
        return tool;
    }
    public int setTool(int n){
        this.tool +=n;
        if (tool <0) tool = 0;
        return tool;
    }

    @Override
    public void step(ArrayList<Units> units) {

    }

    @Override
    public String getInfo() {
        return "Рабочий - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Инструмент-" + tool
                + " x="+coord.x + ", y=" + coord.y;
    }
}
