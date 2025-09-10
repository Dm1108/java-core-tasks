package school.sorokin.javacore.OOP.lesson6;

public class GameScore {

    public static int totalScore = 0;

    public static int addPoints(int points) {
        return totalScore += points;
    }

}
