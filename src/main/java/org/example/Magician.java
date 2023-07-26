package org.example;

import java.util.ArrayList;

public class Magician extends Units{
    public int magic=10; //персональный навык персонажа способность восстановления здоровья персонажей 0-10

    public Magician(String name, int x, int y) {
        super(name, x, y);
        this.magic = magic;
    }

    public Units FindSick(Magician magician, ArrayList<Units> teamFriend) {
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
        public void step (ArrayList < Units > friend, ArrayList<Units> enemy) {
            if (magic < 1 || health < 1) {return;}
            Units friendSick = FindSick(Magician.this, friend); //передать команду друзей
            addHealth(friendSick);
            if (friendSick!=null) {magic--;}
        }

        @Override
        public String getInfo () {
            return "Маг - " + name + " Здоровье-" + health + " Магия-" + magic + " x=" + coord.x + ", y=" + coord.y;
        }

    @Override
    public int checkArm() {
        return magic;
    }
    public String getType(){
        return "Magician";
    }

    public void addArmed(){
        return;
    }
}
