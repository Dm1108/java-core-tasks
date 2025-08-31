package school.sorokin.javacore.basics;

import java.util.Scanner;

public class StringLesson {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст");
        String text = scanner.nextLine();
        System.out.println(text);
        System.out.println("Длина строки: " + text.length());
        System.out.println("Текст в верхнем регистре: " + text.toUpperCase());
        System.out.println("Содержится ли слово \"Java\"? : " + text.contains("Java"));
        System.out.println("Вывести первый индекс слова \"Java\"? : " + text.indexOf("Java"));
        String[] words = text.replaceAll("\\pP", "").split(" ");
        for (String s : words) {
            System.out.println(s);
        }
    }
}
