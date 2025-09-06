package school.sorokin.javacore.OOP.lesson2;

public class Main {

    public static void main(String[] args) {

        byte b = 12;
        short s = 1427;
        int number = 123567;
        long l = 456546677L;
        float f = 3.14f;
        double d = 5.23454352;
        boolean isRight = true;
        char ch = 'f';

        System.out.println("byte b = " + b);
        System.out.println("short s = " + s);
        System.out.println("int number = " + number);
        System.out.println("long l = " + l);
        System.out.println("float f = " + f);
        System.out.println("double d = " + d);
        System.out.println("boolean isRight = " + isRight);
        System.out.println("char ch = " + ch);

        changePrimitive(number);

        Car car = new Car();
        car.model = "Jaguar";
        car.color = "white";
        car.wheelCount = 4;
        car.weight = 1523.40;
        car.maxSpeed = 320;

        System.out.println("model - " + car.model);
        System.out.println("color - " + car.color);
        System.out.println("wheelCount - " + car.wheelCount);
        System.out.println("weight - " + car.weight);
        System.out.println("maxSpeed - " + car.maxSpeed);

        changeObject(car);

        System.out.println("model - " + car.model);
        System.out.println("color - " + car.color);
        System.out.println("wheelCount - " + car.wheelCount);
        System.out.println("weight - " + car.weight);
        System.out.println("maxSpeed - " + car.maxSpeed);

        car = null;

        System.gc();
    }

    public static void changePrimitive(int number) {
        number = 5465474;
        System.out.println("after change int number = " + number);
    }

    public static void changeObject(Car car) {
        car.model = "Toyota";
        car.color = "black";
        car.wheelCount = 5;
        car.weight = 2267.80;
        car.maxSpeed = 280;
    }
}
