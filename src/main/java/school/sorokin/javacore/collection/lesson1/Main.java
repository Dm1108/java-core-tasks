package school.sorokin.javacore.collection.lesson1;

public class Main {

    public static void main(String[] args) {
        GenericBox<String> box1 = new GenericBox<>("firstBox");
        GenericBox<String> box2 = new GenericBox<>("secondtBox");
        System.out.println("Содержимое коробки box1 :" + box1.getT());
        System.out.println("Содержимое коробки box2 :" + box2.getT());
        System.out.println(box1.isEqual(box2));
        box1.swap(box2);
        System.out.println("Содержимое коробки box1 :" + box1.getT());
        System.out.println("Содержимое коробки box2 :" + box2.getT());
        box1.setT("firstBox");
        System.out.println("Содержимое коробки box1 :" + box1.getT());
        System.out.println("Содержимое коробки box2 :" + box2.getT());
        System.out.println(box1.isEqual(box2));

        GenericBox<Integer> box3 = new GenericBox<>(10);
        GenericBox<Integer> box4 = new GenericBox<>(20);
        System.out.println("Содержимое коробки box3 :" + box3.getT());
        System.out.println("Содержимое коробки box4 :" + box4.getT());
        System.out.println(box3.isEqual(box4));
        box3.swap(box4);
        System.out.println("Содержимое коробки box3 :" + box3.getT());
        System.out.println("Содержимое коробки box4 :" + box4.getT());
        box4.setT(20);
        System.out.println("Содержимое коробки box3 :" + box3.getT());
        System.out.println("Содержимое коробки box4 :" + box4.getT());
        System.out.println(box3.isEqual(box4));
    }
}
