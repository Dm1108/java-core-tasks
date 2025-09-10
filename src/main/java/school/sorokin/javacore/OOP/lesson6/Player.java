package school.sorokin.javacore.OOP.lesson6;

public class Player {

    private String name;
    private int personScore;

    public Player(String name, int points) {
        this.name = name;
        personScore += points;
        GameScore.totalScore += points;
    }

    public String getName() {
        return name;
    }

    public int getPersonScore() {
        return personScore;
    }
}
