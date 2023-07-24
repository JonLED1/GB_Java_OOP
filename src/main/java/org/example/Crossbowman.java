package org.example;

import java.util.ArrayList;

public class Crossbowman extends Units{
    public int arrow=10; //персональный навык персонажа стрелы 0-10.

    public Crossbowman(String name, int health, int defence, int force, int x, int y) {
        super(name, health, defence, force, x, y);
        this.arrow = arrow;
    }

    public int checkArrow(){
        return arrow;
    }
    public int setArrow(int n){
        this.arrow +=n;
        if (arrow<0) arrow =0;
        return arrow;
    }

    public Units FindEnemy(Crossbowman crossbowman, ArrayList<Units> team){
        double min_distance = crossbowman.coord.CountDistance(team.get(0).coord);
        Units teamEnemy = team.get(0);
        for (int n = 0; n < team.size(); n++){
            if (crossbowman.coord.CountDistance(team.get(n).coord) < min_distance ){
                min_distance = crossbowman.coord.CountDistance(team.get(n).coord);
                teamEnemy = team.get(n);
            }
        }
        return teamEnemy;
    }
    @Override
    public void step(ArrayList<Units> units) {
        if (arrow<1 || health<1) return;
        Units Enemy = FindEnemy(Crossbowman.this, units);
        doAttack(Enemy);
        if (units.contains(Worker.class)){
            return;
        }
        arrow --;
    }

    @Override
    public String getInfo() {
        return "Арбалетчик - " + name + " Здоровье-" + health + " Защита-" + defence + " Сила-" + force  + " Стрелы-" + arrow
                + " x="+coord.x + ", y=" + coord.y;
    }
}
