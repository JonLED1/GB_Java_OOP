package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Units> team1 = new ArrayList<>();
        List<Units> team2 = new ArrayList<>();

        for (int n = 0; n < 1; n++){
            team1.add(new Crossbowman(getName(), 10,10,10, n, 0));
            team1.add(new Monk(getName(), 10, 10, 10, n, 1));
            team1.add(new Sniper(getName(), 10, 10, 10, n, 2));
            team1.add(new Worker(getName(), 10, 10, 10, n, 3));

            team2.add(new Magician(getName(), 10, 10, 10, n+10, 0));
            team2.add(new Rogue(getName(), 10, 10, 10, n+10, 1));
            team2.add(new Spearman(getName(), 10, 10, 10, n+10, 2));
            team2.add(new Worker(getName(), 10, 10, 10, n+10, 3));
        }
//        Collections.sort(team1, new Comparator<Units>() {
//            @Override
//            public int compare(Units o1, Units o2) {
//                return o2.getInfo().compareTo(o1.getInfo());
//            }
//        });
////        Collections.sort(team2, new Comparator<Units>() {
//            @Override
//            public int compare(Units o1, Units o2) {
//                return o2.getInfo().compareTo(o1.getInfo());
//            }
//        });

        ShowTeams((ArrayList<Units>) team1, (ArrayList<Units>) team2);

        double current_distance = team1.get(0).coord.CountDistance(team2.get(0).coord);
        double min_distance = current_distance;
        String team1_min = team1.get(0).name;
        String team2_min = team2.get(0).name;
        for (int n = 0; n < team1.size(); n++){
            for (int i = 0; i < team2.size(); i++){
                current_distance = team1.get(n).coord.CountDistance(team2.get(i).coord);
                if (current_distance < min_distance){
                    min_distance = current_distance;
                    team1_min = team1.get(n).name;
                    team2_min = team2.get(i).name;
                }
            }
        }

        team1.get(0).step((ArrayList<Units>) team2);
        ShowTeams((ArrayList<Units>) team1, (ArrayList<Units>) team2);
    }
    private static String getName(){
        String s = String.valueOf(Name.values()[new Random().nextInt(Name.values().length)]);
        return s;
    }

    public static void ShowTeams(ArrayList<Units> team1, ArrayList<Units> team2) {
        System.out.println("-----------------------------------------------------");
        for (int n = 0; n < team1.size(); n++) {
            System.out.println(team1.get(n).getInfo());
        }

        System.out.println();

        for (int n = 0; n < team2.size(); n++) {
            System.out.println(team2.get(n).getInfo());
        }
    }
}