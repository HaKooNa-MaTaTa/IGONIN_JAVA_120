import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int arrray[] = {0, 0, 0, 0, 0, 0, 0, 0, 0};
		int filter = 0;
		int i;
		int number = 0;
		while (true) {
			if (number == -1) {
				break;
			}
			number = scanner.nextInt();
			while (number > 0) {
				filter = number % 10;
				number = number / 10;
			for (i = 1; i < 11; i++) {
				if (filter == i) {
					arrray[i - 1] = arrray[i - 1] + 1;
				}
			}		
			}
		}
		for (i = 1;i <= 9; i++) {
			System.out.println("Number of digits " + i + " = " + arrray[i - 1]);
		}
	}
}

		
