package itis;

import java.util.Arrays;

public class IntegerArrayList {
    static int[] array = new int[10];

    public static void add(int a) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = a;
                break;
            }
        }
    }
    public static void get(int a) {
        System.out.println(array[a]);
    }
    public static void removeByIndex(int a) {
        int[] bufferArray = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = bufferArray[i];
        }
        array[a] = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < a) {
                array[i] = bufferArray[i];
            }
            else {
                array[i] = bufferArray[i + 1];
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
