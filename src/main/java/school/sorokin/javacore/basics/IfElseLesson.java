package school.sorokin.javacore.basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IfElseLesson {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите число от 1 до 5");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Комедия");
                    break;
                case 2:
                    System.out.println("Драма");
                    break;
                case 3:
                    System.out.println("Фантастика");
                    break;
                case 4:
                    System.out.println("Боевик");
                    break;
                case 5:
                    System.out.println("Аниме");
                    break;
                default:
                    System.out.println("Такого жанра не знаю");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Введённый символ не является целым числом");
        }
    }
}
