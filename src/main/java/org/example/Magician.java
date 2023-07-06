package org.example;

public class Magician extends Units{
    public int magic; //персональный навык персонажа магия 0-3.

    public Magician(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
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
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Маг - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Магия-" + magic
                    + " ["+place_xy[0] + "," + place_xy[1] + "]";
        }

}
