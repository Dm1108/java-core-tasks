package school.sorokin.javacore.collection.lesson2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TaskManager {

    private List<String> todoList = new ArrayList<>();
    private List<String> todoList2 = new LinkedList<>();

    public void addTaskToArrayList(String task) {
        todoList.add(task);
    }

    public void addTaskToLinkedList(String task) {
        todoList2.add(task);
    }

    public void addTaskToIndexInArrayList(int index, String task) {
        todoList.add(index, task);
    }

    public void addTaskToIndexInLinkedList(int index, String task) {
        todoList2.add(index, task);
    }

    public void removeByTaskInArrayList(String task) {
        todoList.remove(task);
    }

    public void removeByIndexInArrayList(int index) {
        todoList.remove(index);
    }

    public void removeByTaskInLinkedList(String task) {
        todoList2.remove(task);
    }

    public void removeByIndexInLinkedList(int index) {
        todoList2.remove(index);
    }

    public void printTasks() {
        System.out.println(todoList);
        System.out.println(todoList2);
    }

}
