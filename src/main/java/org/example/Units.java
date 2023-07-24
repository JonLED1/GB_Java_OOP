package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Units implements Interface{
    public String name; //имя персонажа
    public int health; //здоровье персонажа 1-10. 0-мертв
    public int defence; //защита персонажа 0-3
    public int force; //сила-урон персонажа 0-3
    Coord coord;
    public Units(String name, int health, int defence, int force, int x, int y){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.force = force;
        coord = new Coord(x,y);

    }

    public void doAttack(Units target){
        int damage = 1;
        target.getDamage(damage);
    }

    public void getDamage(int damage){
        if (this.health-damage>0){
            this.health -= damage;
        }
        else {
            this.health = 0;
        }
    }

  }
