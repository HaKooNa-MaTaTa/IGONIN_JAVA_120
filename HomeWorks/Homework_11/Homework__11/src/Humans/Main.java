package Humans;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Human[] humans = new Human[10];
	    int maxValueAge = 0;
	    int temp = 0;
	    int k = 0;
	    for (int i = 0; i < humans.length; i++) {
	        humans[i] = new Human();
	        System.out.println("Please, enter name a " + (i + 1) + " human");
            humans[i].name = scanner.next();
            System.out.println("Please, enter age a " + (i + 1) + " human");
            humans[i].age = scanner.nextInt();
            if (humans[i].age > maxValueAge) {
            	maxValueAge = humans[i].age;
			}
        }
	    int[] ages = new int[maxValueAge + 1];
	    for (int i = 0; i < humans.length; i++) {
	    	ages[humans[i].age]++;
		}
	    int[] result = new int[10];
		System.out.println(Arrays.toString(ages));
	    for (int i = 0; i < ages.length; i++) {
	    	if (ages[i] > temp) {
	    		k = 0;
	    		for (int j = 0; j < result.length; j++) {
	    			result[j] = 0;
				}
	    		result[k] = i;
	    		temp = ages[i];
			} else if (ages[i] == temp) {
	    		k++;
	    		result[k] = i;
			}
		}
		System.out.println("Common age: ");
		for (int i = 0; i < result.length; i++) {
            if (result[i] != 0) {
                System.out.println(result[i]);
            }
        }
    }
}
