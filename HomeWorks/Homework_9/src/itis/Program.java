package itis;

import java.util.Scanner;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter length array: ");
        int[] arrayNumbers = new int[scanner.nextInt()];
        for (int i = 0; i < arrayNumbers.length; i++) {
            System.out.println("Please, enter " + i + " element");
            arrayNumbers[i] = scanner.nextInt();
        }
        int[] bufferArray = new int[arrayNumbers.length];

        System.out.println(Arrays.toString(arrayNumbers));
        mergeSort(arrayNumbers, bufferArray, 0, arrayNumbers.length - 1);
        System.out.println(Arrays.toString(arrayNumbers));
    }
    private static void mergeSort(int[] array1,int[] array2, int firstIndex, int lastIndex) {
        if ((array1.length <= 1) || (firstIndex == lastIndex)) {
            array2[firstIndex] = array1[firstIndex];
            return;
        }
        else {
            int middleIndex = firstIndex + (lastIndex - firstIndex) / 2;
            mergeSort(array1, array2, firstIndex, middleIndex);
            if (middleIndex < lastIndex) {
                middleIndex++;
            }
            mergeSort(array1, array2, middleIndex, lastIndex);

            int i = firstIndex;
            int j = middleIndex;

            for (int k = firstIndex; k <= lastIndex; k++) {

                if ((i < middleIndex) && (j <= lastIndex)) {
                    if (array2[i] < array2[j]) {
                        array1[k] = array2[i];
                        i++;
                    }
                    else {
                        array1[k] = array2[j];
                        j++;
                    }
                }
                else {
                    if (i < middleIndex) {
                        array1[k] = array2[i];
                        i++;
                    }
                    else {
                        array1[k] = array2[j];
                        j++;
                    }
                }
            }

            for (int n = firstIndex; n <= lastIndex; n++) {
                array2[n] = array1[n];
            }
        }
    }
}
