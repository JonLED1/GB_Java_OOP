package org.example;

public class Worker extends Units{
    public int tool; //персональный навык персонажа инструмент 0-3. возможность создавать оружие. навык восстанавливается через 3 хода.

    public Worker(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Рабочий - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Инструмент-" + tool
                + " ["+place_xy[0] + "," + place_xy[1] + "]";
    }
}
