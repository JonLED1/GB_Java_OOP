package org.example;

import java.util.Arrays;

public abstract class Units {
    public String name;
    public int health;
    public int defence;
    public int force;
    public int[] place_xy = new int[2];
    public Units(String name, int health, int defence, int force, int[] place){
        this.name = name;
        this.health = health;
        this.defence = defence;
        this.force = force;
        this.place_xy = place_xy;
    }

    public String getName () {
        return name;}

    public int getDefence() {
        return defence;
    }

    public int getForce() {
        return force;
    }

    public int getHealth() {
        return health;
    }

    public int[] getPlace_xy() {
        return place_xy;
    }
}
