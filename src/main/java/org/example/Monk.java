package org.example;

public class Monk extends Units{
    public int recover;

    public Monk(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
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
}
