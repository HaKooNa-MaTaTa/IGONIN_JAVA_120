package itis;

public class SortAge {

    public static void sortAge(int[] array) {
        int[] outArray = new int[array.length];
        int[] maxValue = new int [10];
        int maxValueAge = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > temp) {
                for (int j = 0; j < outArray.length; j++) {
                    outArray[j] = 0;
                }
                temp = array[i];
                outArray[i]++;
            }
            else if (array[i] == temp) {
                outArray[i]++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = outArray[i];
        }
    }
}
