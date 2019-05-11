import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please, enter length array");
            int arrayLength = scanner.nextInt();
            int[] array = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                System.out.println("please enter " + (i + 1) + " number array");
                array[i] = scanner.nextInt();
            }
            System.out.println("Enter number operation: 1 - sum, 2 - gystograma, 3 - average");
            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println(sum(array));
            }
            if (choice == 2) {
                int[] result = getVectorOfFrequency(array);
                for (int i = 1; i < result.length; i++) {
                    if (result[i] > 0) {
                        System.out.println("Index " + i + " : " + result[i]);
                    }
                }
            }
            if (choice == 3) {
                System.out.println("Average = " + average(array));
            }
            System.out.println("Repeat application? (1 - yes, 0 - no)");
            int repeat = scanner.nextInt();
            if (repeat == 0) {
                break;
            }
        }
    }
    public static int sum(int array[]) {
        int result = 0;
        for (int j = 0; j < array.length; j++) {
            result = result + array[j];
        }
        return result;
    }
    public static int[] getVectorOfFrequency(int array[]) {
        int[] resultArray = new int[1001];
        for (int i = 0; i < array.length; i++) {
             resultArray[array[i]]++;
        }
        return resultArray;
    }
    public static double average(int array[]) {
        return (double) sum(array) / array.length;
    }
}
