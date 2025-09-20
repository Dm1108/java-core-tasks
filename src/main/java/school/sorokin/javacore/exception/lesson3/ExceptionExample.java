package school.sorokin.javacore.exception.lesson3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExceptionExample {

    private static final Logger logger = Logger.getLogger(ExceptionExample.class.getName());
    private static final Scanner scanner = new Scanner(System.in);
    private static List<String> operationInfo = new ArrayList<>();
    private static int number1;
    private static int number2;


    public static void main(String[] args) {

        while (true) {
            try {
                System.out.println("Введите первое число: ");
                number1 = scanner.nextInt();
                System.out.println("Введите второе число: ");
                number2 = scanner.nextInt();
                scanner.nextLine();
                int result = getDivision(number1, number2);
                String info = "Результат деления: " + number1 + " / " + number2 + " = " + result;
                logger.log(Level.INFO, info);
                operationInfo.add(info);
            } catch (InputMismatchException e) {
                String mismatch = "Вы ввели не число. Повторите ввод";
                logger.log(Level.SEVERE, mismatch, e);
                operationInfo.add(mismatch);
                scanner.reset();
            } catch (ArithmeticException e) {
                String arithmetic = "Деление " + number1 + " / " + number2 + " завершилось ошибкой: деление на ноль";
                logger.log(Level.SEVERE, arithmetic, e);
                operationInfo.add(arithmetic);
                scanner.reset();
            }
            System.out.println("Хотите выполнить ещё одно деление: да / нет ");
            while (true) {
                String yesOrNo = scanner.nextLine();
                if (yesOrNo.equalsIgnoreCase("да") || yesOrNo.equalsIgnoreCase("нет")) {
                    switch (yesOrNo) {
                        case "да":
                            break;
                        case "нет":
                            System.out.println(operationInfo);
                            System.exit(0);
                    }
                    break;
                } else {
                    System.out.println("Вы ввели неправильное слово. Повторите ввод");
                }
            }
        }
    }

    private static int getDivision(int number1, int number2) {
        return number1 / number2;
    }
}
