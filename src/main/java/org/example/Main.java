package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Units> team1 = new ArrayList<>();
        List<Units> team2 = new ArrayList<>();

        for (int n = 0; n <10; n++){
            team1.add(new Crossbowman(getName(), 10,10,10, new int[]{0,0}));
            team1.add(new Magician(getName(), 10, 10, 10, new int[]{0,0}));
            team1.add(new Monk(getName(), 10, 10, 10, new int[]{0,0}));
            team1.add(new Rogue(getName(), 10, 10, 10, new int[]{0,0}));
            team1.add(new Sniper(getName(), 10, 10, 10, new int[]{0,0}));
            team1.add(new Spearman(getName(), 10, 10, 10, new int[]{0,0}));
            team1.add(new Worker(getName(), 10, 10, 10, new int[]{0,0}));

            team2.add(new Crossbowman(getName(), 10,10,10, new int[]{0,0}));
            team2.add(new Magician(getName(), 10, 10, 10, new int[]{0,0}));
            team2.add(new Monk(getName(), 10, 10, 10, new int[]{0,0}));
            team2.add(new Rogue(getName(), 10, 10, 10, new int[]{0,0}));
            team2.add(new Sniper(getName(), 10, 10, 10, new int[]{0,0}));
            team2.add(new Spearman(getName(), 10, 10, 10, new int[]{0,0}));
            team2.add(new Worker(getName(), 10, 10, 10, new int[]{0,0}));
        }
        Collections.sort(team1, new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return o2.getInfo().compareTo(o1.getInfo());
            }
        });

        Collections.sort(team2, new Comparator<Units>() {
            @Override
            public int compare(Units o1, Units o2) {
                return o2.getInfo().compareTo(o1.getInfo());
            }
        });


        for (int n =0; n<team1.size()-1; n++){
            System.out.println(team1.get(n).getInfo());
        }

        System.out.println();

        for (int n =0; n<team2.size()-1; n++){
            System.out.println(team2.get(n).getInfo());
        }


    }

    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }
}