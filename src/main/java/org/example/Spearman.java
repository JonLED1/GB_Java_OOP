package org.example;

import java.util.ArrayList;

public class Spearman extends Units{
    public int spear = 10; //персональный навык персонажа копья 0-10.

    public Spearman(String name, int x, int y) {
        super(name, x, y);
        this.spear = spear;
    }

    public Units FindEnemy(Spearman spearman, ArrayList<Units> teamEnemy){
        double min_distance = 100;
        Units Enemy = null;
        for (Units currentEnemy : teamEnemy){
            if (spearman.coord.CountDistance(currentEnemy.coord) < min_distance && currentEnemy.health>0){
                min_distance = spearman.coord.CountDistance(currentEnemy.coord);
                Enemy = currentEnemy;
            }
        }
        return Enemy;
    }
    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {
        if (spear<1 || health<1) return;
        Units EnemyForAttack = FindEnemy(Spearman.this, enemy);
        doAttack(EnemyForAttack);
        if (EnemyForAttack!=null){spear --;}
    }
    @Override
    public String getInfo() {
        return "Копейщик - " + name + " Здоровье-" + health  + " Копье-" + spear + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return spear;
    }
    public String getType(){
        return "Spearman";
    }

    public void addArmed(){
        spear +=1;
    }

}
