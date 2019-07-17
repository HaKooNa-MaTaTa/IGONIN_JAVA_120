package ru.itis.Lists;

public class IntegerArrayList {
    static final int DEFAULT_LENGTH_ARRAY = 10;
    static int[] array = new int[DEFAULT_LENGTH_ARRAY];
    static private int count = 0;
    public static void add(int number) {
        if (count < DEFAULT_LENGTH_ARRAY) {
            array[count] = number;
            count++;
        }
        else {
            System.err.println("Array full");
        }
    }
    public static int get(int index) {
        int temp = 0;
        if (index < DEFAULT_LENGTH_ARRAY) {
            temp = array[index];
        } return temp;
    }
    public static void removeByIndex(int index) {
        int[] buffArray = new int[DEFAULT_LENGTH_ARRAY];
        int j = 0;
        for(int i = 0; i < DEFAULT_LENGTH_ARRAY; i++) {
            if (i != index) {
                array[i] = buffArray[j];
                j++;
            }
        }
        for (int i = 0; i < DEFAULT_LENGTH_ARRAY; i++) {
            array[i] = buffArray[i];
        }
    }
    public static void removeByValue(int number) { // dodelat
        int[] buffArray = new int[DEFAULT_LENGTH_ARRAY];

        for (int i = 0; i < DEFAULT_LENGTH_ARRAY; i++) {
            buffArray[i] = array[i];
            array[i] = 0;
        }

        for (int i = 0; i < DEFAULT_LENGTH_ARRAY; i++) {
            if (buffArray[i] != number) {
                array[i] = buffArray[i];
            }
            else {
                for (int j = i + 1; j < DEFAULT_LENGTH_ARRAY; j++) {
                    buffArray[j] = array[j - 1];
                }
                return;
            }
        }

    }
    public static int indexOf(int number) {
        int temp = -1;
        for (int i = 0; i < DEFAULT_LENGTH_ARRAY; i++) {
            if (array[i] == number) {
                temp = i;
            }
        }
        return temp;
    }

}
