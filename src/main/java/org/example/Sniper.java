package org.example;

public class Sniper extends Units{
    public int bullet;

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
}
