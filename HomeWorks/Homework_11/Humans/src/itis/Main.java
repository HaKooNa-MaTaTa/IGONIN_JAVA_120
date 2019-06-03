package itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Humans[] humans = new Humans[10];
        int[] ages = new int[10];
        int ageMaxValue = 0;
	    for (int i = 0; i < humans.length; i++) {
	        humans[i] = new Humans();
	        System.out.println("Please, enter name " + (i + 1) + " a human");
	        humans[i].name = scanner.next();
	        System.out.println("Please, enter age " + (i + 1) + " human");
	        humans[i].age = scanner.nextInt();
	        if (humans[i].age > ageMaxValue) {
	            ageMaxValue = humans[i].age;
            }
        }
        int[] ageArray = new int[ageMaxValue + 1];
	    for (int i = 0; i < humans.length; i++) {
	        ageArray[humans[i].age]++;
        }
	    SortAge.sortAge(ageArray);
	    for (int i = 0; i < ageArray.length; i++) {
	    	if(ageArray[i] > 0) {
	    		System.out.print("Age: ");
	    		System.out.print(i + ", ");
			}
		}
    }
}
