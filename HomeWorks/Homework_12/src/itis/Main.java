package itis;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Status television: " + Television.getStatusTV());
		System.out.println("For power television please enter ON");
		String choiceCanal;

		while (true) {
			String choice = scanner.nextLine();
			Television.setStatusTV(choice);
			System.out.println("Status television: " + Television.getStatusTV());
			if (choice.equals("ON")) {
				break;
			}
		}
		Television.getListCanalsForWatch();
		while (true) {
			System.out.println("Please, choice a canal for watch");
			choiceCanal = scanner.nextLine();
			if (choiceCanal.equals("OFF")) {
				Television.setStatusTV(choiceCanal);
				System.out.println("Status television: " + Television.getStatusTV());
				break;
			} else {
				int temp = Integer.parseInt(choiceCanal);
				for (int i = 0; i < TVCanals.getListCanals().length; i++) {
					if (temp == i) {
						System.out.println("You are now on the " + TVCanals.getListCanals()[i]);
						System.out.println("Program: " + TVCanals.getListPrograms()[i]);
					}
				}
			}
		}
	}
}