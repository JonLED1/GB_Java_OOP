package org.example;

public class Coord {
    int x, y;

    public Coord(int x, int y){
        this.x=x;
        this.y=y;
    }

    public  double CountDistance(Coord coord){
        int dx = coord.x - x;
        int dy = coord.y - y;
        return Math.sqrt(Math.pow(dx, 2) +Math.pow(dy, 2));
    }
}
