package school.sorokin.javacore.OOP.lesson4;

import java.util.Scanner;

public class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение радиуса круга: ");
        double radius = scanner.nextDouble();
        double circleArea = Math.PI * Math.pow(radius, 2);
        System.out.println("Площадь круга - " + circleArea);
    }
}
