package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Units implements Interface {
    public String name; //имя персонажа
    public int health = 10; //здоровье персонажа 1-10. 0-мертв
    Coord coord;

    public Units(String name, int x, int y) {
        this.name = name;
        this.health = health;
         coord = new Coord(x, y);

    }

    public void doAttack(Units enemy) {
        if (enemy == null) {
            return;
        }
        if (enemy.health - 1 > 0) {
            enemy.health -= 1;
        } else {
            enemy.health = 0;
        }
    }

    public void addHealth(Units friend) {
        if (friend == null) {
            return;
        }
        if (friend.health + 1 < 11) {
            friend.health += 1;
        }
    }

    public void  addArm(Units friend){
        if (friend == null) {
            return;
        }
        if (friend.checkArm() + 1 < 11) {
            friend.addArmed();
        }
    }

}