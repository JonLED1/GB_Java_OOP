package org.example;

public class Crossbowman extends Units{
    public int arrow; //персональный навык персонажа стрелы 0-10.

    public Crossbowman(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
        this.arrow = arrow;
    }

    public int checkArrow(){
        return arrow;
    }
    public int setArrow(int n){
        this.arrow +=n;
        if (arrow<0) arrow =0;
        return arrow;
    }
    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Арбалетчик - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Стрелы-" + arrow
                + " ["+place_xy[0] + "," + place_xy[1] + "]";
    }
}
