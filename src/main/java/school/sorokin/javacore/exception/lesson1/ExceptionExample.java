package school.sorokin.javacore.exception.lesson1;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое число: ");
            int number1 = scanner.nextInt();
            System.out.println("Введите первое число: ");
            int number2 = scanner.nextInt();
            int result = number1 / number2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль. Пожалуйста, попробуйте другое число");
        } finally {
            System.out.println("Спасибо за использование программы");
        }


    }
}
