package com.cherniauski.trening.task6;

/**
 * Created by ivc4 on 12.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        NuclearMarine nuclearMarine = new NuclearMarine("Nerpa", 12770);
        Captain captain = new Captain("Bobrov", 15);
        nuclearMarine.setCaptain(captain);
        nuclearMarine.setCountCrew(73);
        captain.setNuclearMarine(nuclearMarine);
        try {
            captain.command(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
