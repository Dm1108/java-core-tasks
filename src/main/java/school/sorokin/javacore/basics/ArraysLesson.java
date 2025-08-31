package school.sorokin.javacore.basics;

import java.util.Arrays;
import java.util.Random;

public class ArraysLesson {

    public static void main(String[] args) {

        int[] array = fillArray();
        System.out.println(Arrays.toString(array));
        findMaxAndMin(array);
        sortedArray(array);
        twoDimensionalArray();
    }

    public static int[] fillArray() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        return array;
    }

    public static void findMaxAndMin(int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex = i;
            }
            if (min > array[i]) {
                min = array[i];
                minIndex = i;
            }
        }
        System.out.printf("Максимальный элемент массива - %d, его индекс - %d\n", max, maxIndex);
        System.out.printf("Минимальный элемент массива - %d, его индекс - %d\n", min, minIndex);
    }

    public static void sortedArray(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    isSorted = false;
                }
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void twoDimensionalArray() {
        int[][] twoDimArray = new int[2][5];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                twoDimArray[i][j] = (int) (Math.random() * 10);
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
