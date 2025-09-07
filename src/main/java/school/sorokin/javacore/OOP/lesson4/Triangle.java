package school.sorokin.javacore.OOP.lesson4;

import java.util.Scanner;

public class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение первой стороны треугольника: ");
        double firstSide = scanner.nextDouble();
        System.out.println("Введите значение второй стороны треугольника: ");
        double secondSide = scanner.nextDouble();
        System.out.println("Введите значение третьй стороны треугольника: ");
        double thirdSide = scanner.nextDouble();
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;

        double triangleSquare = Math.sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) *
                (semiPerimeter - thirdSide));

        System.out.println("Площадь треугольника - " + triangleSquare);
    }
}
