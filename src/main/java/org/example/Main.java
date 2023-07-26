package org.example;

import java.util.*;

public class Main {

    public  static ArrayList<Units> team1 = new ArrayList<>();
    public  static ArrayList<Units> team2 = new ArrayList<>();
    public  static ArrayList<Units> allteam = new ArrayList<>();
    public static void main(String[] args) {
        team1.add(new Crossbowman(getName(), 1, 1));
        team1.add(new Monk(getName(), 1, 2));
        team1.add(new Sniper(getName(),  1, 3));
        team1.add(new Worker(getName(), 1, 4));
        team1.add(new Crossbowman(getName(), 1, 5));
        team1.add(new Monk(getName(), 1, 6));
        team1.add(new Sniper(getName(),1, 7));
        team1.add(new Worker(getName(), 1, 8));
        team1.add(new Crossbowman(getName(), 1, 9));
        team1.add(new Monk(getName(), 1, 10));

        team2.add(new Magician(getName(),10, 1));
        team2.add(new Rogue(getName(),10, 2));
        team2.add(new Spearman(getName(), 10, 3));
        team2.add(new Worker(getName(), 10, 4));
        team2.add(new Magician(getName(), 10, 5));
        team2.add(new Rogue(getName(), 10, 6));
        team2.add(new Spearman(getName(),10, 7));
        team2.add(new Worker(getName(), 10, 8));
        team2.add(new Magician(getName(), 10, 9));
        team2.add(new Rogue(getName(), 10, 10));

        allteam.addAll(team1);
        allteam.addAll(team2);

        Scanner in = new Scanner(System.in);

        while (true) {
            View.view();
            in.nextLine();
            for (Units hero : allteam) {
                if (team2.contains(hero)) {
                    hero.step(team2, team1);
                }
                else {
                   hero.step(team1, team2);
                }
            }
        }
    }

    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }
}