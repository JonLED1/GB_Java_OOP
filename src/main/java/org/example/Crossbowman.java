package org.example;

import java.util.ArrayList;

public class Crossbowman extends Units{
    public int arrow=10; //персональный навык персонажа стрелы 0-10.

    public Crossbowman(String name, int x, int y) {
        super(name, x, y);
        this.arrow = arrow;
    }

    public Units FindEnemy(Crossbowman crossbowman, ArrayList<Units> teamEnemy){
        double min_distance = 100;
        Units Enemy = null;
        for (Units currentEnemy : teamEnemy){
            if (crossbowman.coord.CountDistance(currentEnemy.coord) < min_distance && currentEnemy.health>0){
                min_distance = crossbowman.coord.CountDistance(currentEnemy.coord);
                Enemy = currentEnemy;
            }
        }
        return Enemy;
    }
    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {
        if (arrow<1 || health<1) return;
        Units EnemyForAttack = FindEnemy(Crossbowman.this, enemy);
        doAttack(EnemyForAttack);
        if (EnemyForAttack!=null){arrow --;}
    }
    @Override
    public int checkArm(){
        return arrow;
    }

    @Override
    public String getType(){
        return "Crossbowman";
    }
    @Override
    public String getInfo() {
        return "Арбалетчик - " + name + " Здоровье-" + health + " Стрелы-" + arrow + " x="+coord.x + ", y=" + coord.y;
    }

    public void addArmed(){
        arrow +=1;
    }
}
