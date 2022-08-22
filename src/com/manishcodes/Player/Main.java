package com.manishcodes.Player;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Dribbler");
        skills.add("Best");
        skills.add("Playmaker");
        Player neymar = new Player("neymar Santos Silva Jr.", 31, 180, 80, "Winger", skills, 400000, "PSG", "Brazil");
        neymar.output();
        skills.clear();
        skills.add("Dribbler");
        skills.add("King of Spain");
        skills.add("Playmaker");
        Player benzema = new Player("benzema Hero", 33, 180, 84, "Striker", skills, 300000, "Real Madrid", "France");
        benzema.output();
    }
}