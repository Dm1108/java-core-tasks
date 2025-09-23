package school.sorokin.javacore.collection.lesson2;

public class Main {


    public static void main(String[] args) {


        TaskManager task = new TaskManager();
        task.addTaskToArrayList("1");
        task.addTaskToArrayList("2");
        task.addTaskToLinkedList("3");
        task.addTaskToLinkedList("4");
        task.printTasks();
        task.addTaskToIndexInArrayList(0, "5");
        task.addTaskToIndexInLinkedList(0, "6");
        task.printTasks();
        task.removeByIndexInArrayList(0);
        task.removeByIndexInLinkedList(0);
        task.printTasks();
        task.removeByTaskInArrayList("1");
        task.removeByTaskInLinkedList("3");
        task.printTasks();




    }
}
