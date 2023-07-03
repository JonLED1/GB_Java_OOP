package org.example;
public class Main {
    public static void main(String[] args) {
        Rogue rogue1 = new Rogue("Rogue1", 10, 10, 10, new int[]{0,0});
        Magician magician1 = new Magician("Magician1", 10, 10, 10, new int[]{0,0});
        Monk monk1 = new Monk("Monk1", 10, 10,10,new int[]{0,0});
        Crossbowman crossbowman1 = new Crossbowman("Crossbowman", 10,10,10, new int[]{0,0});
        Sniper sniper1 = new Sniper("Sniper1", 10,10,10,new int[]{0,0});
        Spearman spearman1 = new Spearman("Spearman1",10,10,10,new int[]{0,0});
        Worker worker1 = new Worker("worker1", 10, 10, 10,new int[]{0,0});

        System.out.println(magician1.checkMagic());
        System.out.println(rogue1.checkKnife());
        System.out.println(monk1.checkRecover());
        magician1.setMagic(-10);
        rogue1.setKnife();
        monk1.setRecover(100);
        System.out.println(rogue1.checkKnife());
        System.out.println(magician1.checkMagic());
        System.out.println(monk1.checkRecover());

    }
}