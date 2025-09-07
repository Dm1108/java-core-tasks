package school.sorokin.javacore.OOP.lesson3;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Toyota");
        car.setModel("Highlander");
        car.setYear(1880);

        Car car1 = new Car();
        car1.setBrand("KIA");
        car1.setModel("Sportage");
        car1.setYear(2021);

        System.out.println(car);
        System.out.println(car1);
    }
}
