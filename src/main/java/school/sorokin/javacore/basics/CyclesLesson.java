package school.sorokin.javacore.basics;

public class CyclesLesson {

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }

        int number = 10;
        while (number > 0) {
            System.out.println(number);
            number--;
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j > 30) {
                    break;
                }
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("----------------");
        }
    }
}
