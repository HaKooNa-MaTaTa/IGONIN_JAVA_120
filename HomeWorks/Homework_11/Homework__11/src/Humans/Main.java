package Humans;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    Human[] humans = new Human[10];
	    for (int i = 0; i < humans.length; i++) {
	        humans[i] = new Human();
	        System.out.println("Please, enter name a " + (i + 1) + " human");
            humans[i].name = scanner.next();
            System.out.println("Please, enter age a " + (i + 1) + " human");
            humans[i].age = scanner.nextInt();
        }
	    int[] ages = new int[10];
	    int temp = 0;
	    int k = 0;
	    int tempSlow = 0;
	    for (int slowPointer = 0; slowPointer < humans.length; slowPointer++) {
	    	for (int fastPointer = 1; fastPointer < humans.length; fastPointer++) {
	    		if (humans[slowPointer].age == humans[fastPointer].age) {
	    			temp++;
				}
			}

			if (temp > tempSlow) {
				tempSlow = temp;
				k = 0;
				for (int i = 0; i < ages[i]; i++) {
					ages[i] = 0;
				}
				ages[k] = humans[slowPointer].age;
				k++;
				temp = 0;
			}
			else if (temp == tempSlow) {
				ages[k] = humans[slowPointer].age;
				k++;
				temp = 0;
			}
			temp = 0;

		}
		System.out.println("Common age: ");
		for (int i = 0; i < ages.length; i++) {
            if (ages[i] != 0) {
                System.out.println(ages[i]);
            }
        }
    }
}
