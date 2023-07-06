package org.example;

import java.util.Arrays;

public abstract class Units implements Interface{
    public String name; //имя персонажа
    public int health; //здоровье персонажа 1-10. 0-мертв
    public int defence; //защита персонажа 0-3
    public int force; //сила-урон персонажа 0-3
    public int[] place_xy = new int[2]; //место персонажа на игровом поле.
    public Units(String name, int health, int defence, int force, int[] place){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.force = force;
        this.place_xy = place_xy;
    }
  }
