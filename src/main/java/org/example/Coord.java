package org.example;

public class Coord {
    int x, y;

    public Coord(int x, int y){
        this.x=x;
        this.y=y;
    }

    public  double CountDistance(Coord coord){
        return Math.sqrt(Math.pow((coord.x-x), 2) + Math.pow((coord.y-y), 2));
    }
}
