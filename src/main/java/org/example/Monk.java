package org.example;

import java.util.ArrayList;

public class Monk extends Units{
    public int recover=10; //персональный навык персонажа способность восстановления здоровья персонажей 0-10.

    public Monk(String name, int x, int y) {
        super(name, x, y);
        this.recover = recover;
    }

    public Units FindSick(Monk monk, ArrayList<Units> teamFriend) {
        double min_health = 5;
        Units Friend = null;
        for (Units currentFriend : teamFriend){
            if (currentFriend.health < min_health && currentFriend.health >0 ){
                min_health = currentFriend.health;
                Friend = currentFriend;
            }
        }
        return Friend;
    }
    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {
        if (recover < 1 || health < 1) {return;}
        Units friendSick = FindSick(Monk.this, friend); //передать команду друзей
        addHealth(friendSick);
        if (friendSick!=null) {recover--;}
    }

    @Override
    public String getInfo() {
        return "Монах - " + name + " Здоровье-" + health + " Восстановление-" + recover  + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return recover;
    }
    public String getType(){
        return "Monk";
    }

    public void addArmed(){
        return;
    }
}
