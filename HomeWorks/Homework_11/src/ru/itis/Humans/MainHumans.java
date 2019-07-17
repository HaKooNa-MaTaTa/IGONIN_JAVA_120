package ru.itis.Humans;

import java.util.Arrays;
import java.util.Scanner;

public class MainHumans {

    static final int AMOUNT_HUMANS = 10;
    static int maxAge = 0;
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);
        Human[] humans = new Human[AMOUNT_HUMANS];
        for(int i = 0; i < AMOUNT_HUMANS; i++) {
            humans[i] = new Human();
            System.out.println("Please, enter name the human: " + (i + 1) + "/" + AMOUNT_HUMANS);
            humans[i].name = scanner.next();
            System.out.println("Please, enter age the human: " + (i + 1) + "/" + AMOUNT_HUMANS);
            humans[i].age = scanner.nextInt();
            if (humans[i].age > maxAge) {
                maxAge = humans[i].age;
            }
        }
        System.out.println("Ages: ");
        for (int i = 0; i < oftenAge(humans).length; i++) {
            if (oftenAge(humans)[i] != 0) {
                System.out.println(oftenAge(humans)[i]);
            }
        }
    }
    public static int[] oftenAge(Human[] humans) {
        int[] ages = new int[maxAge + 1];
        int j = 0;
        int maxValue = 0;
        for (int i = 0; i < AMOUNT_HUMANS; i++) {
            ages[humans[i].age]++;
        }
        int[] finalAge = new int[AMOUNT_HUMANS];
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] != 0) {
                if (ages[i] > maxValue) {
                    j = 0;
                    for (int k = 0; k < finalAge.length; k++) {
                        finalAge[k] = 0;
                    }
                    finalAge[j] = i;
                    maxValue = ages[i];

                } else if (ages[i] == maxValue) {
                    j++;
                    finalAge[j] = i;
                }
            }
        }
        return finalAge;
    }
}
