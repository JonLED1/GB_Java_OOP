package org.example;

public class Monk extends Units{
    public int recover; //персональный навык персонажа способность восстановления здоровья персонажей 0-10.

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

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Монах - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Восстановление-" + recover
                + " ["+place_xy[0] + "," + place_xy[1] + "]";
    }
}
