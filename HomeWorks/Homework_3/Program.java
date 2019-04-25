import java.util.Scanner;

class Program {
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		int chislo;
		int chislo2;
		chislo = scanner.nextInt();
		System.out.println(sum(chislo));
		chislo2 = scanner.nextInt();
			if (sum(chislo)%2 == 0) {
				
				while (chislo2 % 2 != 0) {
		
				System.out.println("Please, repeat input");
				chislo2 = scanner.nextInt();
				} System.out.println(multiply(chislo2));
			
		}
			System.out.println(multiply(chislo2));
	} 




	private static int sum(int chislo) {
		int sum = 0;

		while (chislo > 0) {
			sum += chislo%10;
			chislo = chislo / 10;
		} return sum;
	}
	private static int sum2 (int chislo2) {
		int sum = 0;

		while (chislo2 > 0) {
			sum += chislo2%10;
			chislo2 = chislo2 / 10;
		} return sum;
	}

	private static int multiply (int chislo2) {
		int multiply = 1;

		while (chislo2 > 0) {
			multiply *= chislo2%10;
			chislo2 = chislo2 / 10;
		} return multiply;
	}
}