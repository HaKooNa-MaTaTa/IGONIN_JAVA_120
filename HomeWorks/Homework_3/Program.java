import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberOne = 0;
		int sumNumber = 0;
		int numberTwo = 0;
		int multiplyNumber = 0;
		while (true) {
			numberOne = scanner.nextInt();
		if (numberOne == -1) {
			break;
		}
			sumNumber = 0;
			while(numberOne > 0) {
				sumNumber = sumNumber + numberOne % 10;
				numberOne = numberOne / 10;
			}
			System.out.println("Sum of digits = " + sumNumber);

			numberTwo = scanner.nextInt();
			if (numberTwo == -1) {
				break;
			}
			multiplyNumber = 1;
			if (sumNumber % 2 == 0) {
				while (numberTwo % 2 == 1) {
					System.out.println("Please repeat input");
					numberTwo = scanner.nextInt();
				}
				while(numberTwo > 0) {
					multiplyNumber = multiplyNumber * (numberTwo % 10);
					numberTwo = numberTwo / 10;
				}
			}
			else if (sumNumber % 2 == 1) {
				while(numberTwo > 0) {
					multiplyNumber = multiplyNumber * (numberTwo % 10);
					numberTwo = numberTwo / 10;
				}
			}
		System.out.println("Multiply of digits = " + multiplyNumber);
		}
	}
}