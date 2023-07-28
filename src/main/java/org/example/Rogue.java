package org.example;

import java.util.ArrayList;

public class Rogue extends Units {
    public int knife=40; //персональный навык персонажа нож 0-10

    public Rogue(String name, int x, int y) {
        super(name, x, y);
        this.knife = knife;
    }


    public Units FindEnemyForAttack(Rogue rogue, ArrayList<Units> teamEnemy){
        double min_distance = 2;
        Units Enemy = null;
        for (Units currentEnemy : teamEnemy){
            if (rogue.coord.CountDistance(currentEnemy.coord) < min_distance && currentEnemy.health>0){
                Enemy = currentEnemy;
                break;
            }
        }
        return Enemy;
    }

    public Units FindEnemyForStep(Rogue rogue, ArrayList<Units> teamEnemy){
        double min_distance = 100;
        Units Enemy = null;
        for (Units currentEnemy : teamEnemy){
            if (rogue.coord.CountDistance(currentEnemy.coord) < min_distance && currentEnemy.health>0){
                min_distance = rogue.coord.CountDistance(currentEnemy.coord);
                Enemy = currentEnemy;
                break;
            }
        }
        return Enemy;
    }

    @Override
    public void step(ArrayList < Units > friend, ArrayList<Units> enemy) {
        if (knife<1 || health<1) return;
        Units EnemyForAttack = FindEnemyForAttack(Rogue.this, enemy);
        doAttack(EnemyForAttack);
        if (EnemyForAttack!=null){
            knife --;
            return;
        }
        Units EnemyForStep = FindEnemyForStep(Rogue.this, enemy);
        if (Rogue.this.coord.x > 2){
            Rogue.this.coord.x -=1;
        }
        else{
            if (Rogue.this.coord.y > 5 && Rogue.this.coord.y <11){
                Rogue.this.coord.y -=1;
            }

            if (Rogue.this.coord.y < 5 && Rogue.this.coord.y > 0){
                Rogue.this.coord.y +=1;
            }

        }
    }

    @Override
    public String getInfo() {
        return "Разбойник - " + name + " Здоровье-" + health +  " Нож-" + knife + " x="+coord.x + ", y=" + coord.y;
    }

    @Override
    public int checkArm() {
        return knife;
    }
    public String getType(){
        return "Rogue";
    }

    public void addArmed(){
        knife +=1;
    }
}
