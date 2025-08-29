package school.sorokin.javacore.basics;

public class OperationLesson {

    public static void main(String[] args) {
        int grade1 = 4;
        int grade2 = 9;
        int grade3 = 6;

        double averageGrade = (grade1 + grade2 + grade3) / 3.0;
        System.out.println(averageGrade);

        if ((grade1 == 10) && (grade2 == 10) && (grade3 == 10)) {
            System.out.println("У студента все оценки максимальные!");
        }

        if (grade1 <= 2 || grade2 <= 2 || grade3 <= 2) {
            System.out.println("Встречается очень низкая оценка!");
        }

        if (averageGrade >= 5) {
            System.out.println("У студента удовлетворительная успеваемость");
        } else {
            System.out.println("У студента неудовлетворительная успеваемость");
        }

        if (grade1 < 0 || grade1 > 10) {
            System.out.println("Ошибка: " + grade1 + " некорректная оценка!");
        } else if (grade2 < 0 || grade2 > 10) {
            System.out.println("Ошибка: " + grade2 + " некорректная оценка!");
        } else if (grade3 < 0 || grade3 > 10) {
            System.out.println("Ошибка: " + grade3 + " некорректная оценка!");
        }

    }
}
