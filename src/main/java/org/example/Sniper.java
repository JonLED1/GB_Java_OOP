package org.example;

public class Sniper extends Units{
    public int bullet; //персональный навык персонажа пули 0-10.

    public Sniper(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Снайпер - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Пуля-" + bullet
                + " ["+place_xy[0] + "," + place_xy[1] + "]";
    }

}
