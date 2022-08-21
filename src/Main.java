import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> skills = new ArrayList<String>();
        skills.add("Dribbler");
        skills.add("Best");
        skills.add("Playmaker");
        Player Neymar = new Player("Neymar Santos Silva Jr.", 31, 180, 80, "Winger", skills, 400000, "PSG", "Brazil");
        Neymar.output();
        skills.clear();
        skills.add("Dribbler");
        skills.add("King of Spain");
        skills.add("Playmaker");
        Player Benzema = new Player("Benzema Hero", 33, 180, 84, "Striker", skills, 300000, "Real Madrid", "France");
        Benzema.output();
    }
}