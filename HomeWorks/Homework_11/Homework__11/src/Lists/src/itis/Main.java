package itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        IntegerArrayList integerArrayList;
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        if (choice == 1) {
            IntegerArrayList.add(1);
            IntegerArrayList.add(2);
            IntegerArrayList.add(3);
            IntegerArrayList.add(4);
            IntegerArrayList.add(5);
            IntegerArrayList.add(6);
            IntegerArrayList.add(7);
            IntegerArrayList.add(8);
            IntegerArrayList.add(9);
            IntegerArrayList.get(choice);
            IntegerArrayList.removeByIndex(5);
        }

        System.out.println(Arrays.toString(IntegerArrayList.array));
    }
}
