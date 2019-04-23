import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int cash = scanner.nextInt();
		int cash_5000 = cash / 5000;
			if (cash_5000 >= 1) {
				cash = cash - cash_5000 * 5000;
				System.out.println("Kolichestvo kupyour 5000: " + cash_5000);
	}
		int cash_2000 = cash / 2000;
			if (cash_2000 >= 1) {
				cash = cash - cash_2000 * 2000;
				System.out.println("Kolichestvo kupyour 2000: " + cash_2000);
	}
		int cash_1000 = cash / 1000;
			if (cash_1000 >= 1) {
				cash = cash - cash_1000 * 1000;
				System.out.println("Kolichestvo kupyour 1000: " + cash_1000);
	}
		int cash_500 = cash / 500;
			if (cash_500 >= 1) {
				cash = cash - cash_500 * 500;
				System.out.println("Kolichestvo kupyour 500: " + cash_500);
	}
		int cash_100 = cash / 100;
			if (cash_100 >= 1) {
				cash = cash - cash_100 * 100;
				System.out.println("Kolichestvo kupyour 100: " + cash_100);
	}
		int cash_50 = cash / 50;
			if (cash_50 >= 1) {
				cash = cash - cash_50 * 50;
				System.out.println("Kolichestvo kupyour 50: " + cash_50);
	}	int cash_10 = cash / 10;
			if (cash_10 >= 1) {
				cash = cash - cash_10 * 10;
				System.out.println("Kolichestvo kupyour 10: " + cash_10);
	}

	System.out.println("Ostalos meloch`you: " + cash);

	}
}