package org.example;

import java.util.ArrayList;

public class Worker extends Units{
    public int tool=10; //персональный навык персонажа инструмент 0-10. возможность создавать оружие.

    public Worker(String name, int x, int y) {
        super(name, x, y);
        this.tool = tool;
    }
    public Units FindFriend(Worker worker, ArrayList<Units> teamFriend){
        double min_arm = 5;
        Units Friend = null;
        for (Units currentFriend : teamFriend){
            if (currentFriend.checkArm() < min_arm && currentFriend.health > 0
                    && currentFriend.getType()!="Monk"
                    && currentFriend.getType()!="Magician"){
                Friend = currentFriend;
                min_arm = currentFriend.checkArm();
            }
        }
        return Friend;
    }
    @Override
    public void step (ArrayList < Units > friend, ArrayList<Units> enemy) { //!!!
        if (tool<1 || health<1) return;
        Units FriendForArm = FindFriend (Worker.this, friend);
        addArm(FriendForArm);
        System.out.println(FriendForArm);
        tool -=1;
    }

    @Override
    public String getInfo() {
        return "Рабочий - " + name + " Здоровье-" + health + " Инструмент-" + tool + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm(){
        return tool;
    }

    @Override
    public String getType(){
        return "Worker";
    }

    public void addArmed(){
        return;
    }
}
