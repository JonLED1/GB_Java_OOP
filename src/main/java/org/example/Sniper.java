package org.example;

import java.util.ArrayList;

public class Sniper extends Units{
    public int bullet = 10; //персональный навык персонажа пули 0-10.

    public Sniper(String name,  int x, int y) {
        super(name, x, y);
        this.bullet = bullet;
    }

    public Units FindEnemyForAttack(Sniper sniper, ArrayList<Units> teamEnemy){
        double min_distance = 2;
        Units Enemy = null;
        for (Units currentEnemy : teamEnemy){
            if (sniper.coord.CountDistance(currentEnemy.coord) < min_distance && currentEnemy.health>0){
                Enemy = currentEnemy;
                break;
            }
        }
        return Enemy;
    }

    public Units FindEnemyForStep(Sniper sniper, ArrayList<Units> teamEnemy){
        double min_distance = 100;
        Units Enemy = null;
        for (Units currentEnemy : teamEnemy){
            if (sniper.coord.CountDistance(currentEnemy.coord) < min_distance && currentEnemy.health>0){
                min_distance = sniper.coord.CountDistance(currentEnemy.coord);
                Enemy = currentEnemy;
                break;
            }
        }
        return Enemy;
    }

    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {
        if (bullet<1 || health<1) return;
        Units EnemyForAttack = FindEnemyForAttack(Sniper.this, enemy);
        doAttack(EnemyForAttack);
        if (EnemyForAttack!=null){
            bullet --;
            return;
        }
        Units EnemyForStep = FindEnemyForStep(Sniper.this, enemy);
        if (Sniper.this.coord.x < 9){
            Sniper.this.coord.x +=1;
        }
    }


    @Override
    public String getInfo() {
        return "Снайпер - " + name + " Здоровье-" + health + " Пуля-" + bullet
                + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return bullet;
    }
    public String getType(){
        return "Sniper";
    }

    public void addArmed(){
        bullet+=1;
    }
}
