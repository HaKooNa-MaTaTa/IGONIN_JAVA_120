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

		//if (number == 1) {
			//result = false;
		//}
		if (number == 3) {
			result = true;
		}
		if (number == 5) {
			result = true;
		}
		if (number == 7) {
			result = true;
		}

		if (number % 2 == 0) {
			if (number == 2){
				result = true;
			}
			else {
				result = false;
			}
		}
		else if (number % 2 == 1) {
			if (number % 3 != 0) {
				if (number % 5 != 0) {
					if (number % 7 != 0) {
						if (number % 9 != 0) {
							result = true;
						}
					}
				}
			}
		} 
		return result;
	}

}