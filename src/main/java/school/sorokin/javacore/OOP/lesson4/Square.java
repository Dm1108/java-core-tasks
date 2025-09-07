package school.sorokin.javacore.OOP.lesson4;

import java.util.Scanner;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    @Override
    public void calculateArea() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение стороны квадрата: ");
        double squareSide = scanner.nextDouble();
        double squareArea = Math.pow(squareSide, 2);
        System.out.println("Площадь квадрата - " + squareArea);
    }
}
