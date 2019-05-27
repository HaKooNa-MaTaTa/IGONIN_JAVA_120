package itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    String[] arrayPeople = new String[20];
	    for (int i = 0; i < arrayPeople.length; i++) {
            arrayPeople[i] = scanner.nextLine();
        }
    }
}
