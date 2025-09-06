package school.sorokin.javacore.OOP.lesson2;

public class Car {

    String model;
    String color;
    int wheelCount;
    double weight;
    int maxSpeed;

    protected void finalize() {

        System.out.println("Car destroyed");
    }
}
