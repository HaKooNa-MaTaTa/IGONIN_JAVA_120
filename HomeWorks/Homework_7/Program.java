import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
		int number = scanner.nextInt();
		boolean resultOut;
			if (number == -1) {
				break;
			}
			if (number == 1){
				resultOut = false;
				System.out.println(resultOut);
			} else {
				resultOut = isPrime(number);
				System.out.println(resultOut);
			}
		}
	}
	public static boolean isPrime(int number) {
		boolean result = false;
		int i;
		int resultDiv = 0;
		for (i = 1; i <= number; i++) {
			int numberForCycle = 0;
			numberForCycle = number % i;
			if (numberForCycle == 0) {
				resultDiv = resultDiv + 1;
			}
		}
		if (resultDiv > 2) {
			result = false;
		}
		else {
			result = true;
		}
		return result;
	}
}
