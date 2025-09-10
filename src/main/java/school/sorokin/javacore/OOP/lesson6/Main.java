package school.sorokin.javacore.OOP.lesson6;

public class Main {

    public static void main(String[] args) {

        Player player1 = new Player("Vasya", 5);
        Player player2 = new Player("Petya", 3);
        Player player3 = new Player("Max", 8);
        Player player4 = new Player("John", 10);
        System.out.printf("Общий счёт: %s\n", GameScore.totalScore);

        System.out.printf("Имя игрока - %s, личный счёт: %s, общий счёт: %s\n",
                player1.getName(), player1.getPersonScore(), GameScore.totalScore);
        System.out.printf("Имя игрока - %s, личный счёт: %s, общий счёт: %s\n",
                player2.getName(), player2.getPersonScore(), GameScore.totalScore);
        System.out.printf("Имя игрока - %s, личный счёт: %s, общий счёт: %s\n",
                player3.getName(), player3.getPersonScore(), GameScore.totalScore);
        System.out.printf("Имя игрока - %s, личный счёт: %s, общий счёт: %s\n",
                player4.getName(), player4.getPersonScore(), GameScore.totalScore);
    }
}
