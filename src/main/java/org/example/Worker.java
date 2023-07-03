package org.example;

public class Worker extends Units{
    public int tool;

    public Worker(String name, int health, int defence, int force, int[] place) {
        super(name, health, defence, force, place);
        this.tool = tool;
    }

    public int checkTool(){
        return tool;
    }
    public int setTool(int n){
        this.tool +=n;
        if (tool <0) tool = 0;
        return tool;
    }
}
