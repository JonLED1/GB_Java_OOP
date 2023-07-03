package org.example;

public class Magician extends Units{
    public int magic;

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
}
