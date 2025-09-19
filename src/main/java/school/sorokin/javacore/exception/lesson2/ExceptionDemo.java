package school.sorokin.javacore.exception.lesson2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionDemo {

    public String checkedExceptionDemo() {
        File file = new File("test.txt"); // Создаем объект файла
        String firstLine = null; // Переменная для хранения первой строки
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            firstLine = reader.readLine(); // Читаем первую строку
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
            e.printStackTrace();
        }
        return firstLine;
    }

    public void uncheckedExceptionDemo() {
        int[] array = new int[5];
        System.out.println(array[10]);
    }
}
