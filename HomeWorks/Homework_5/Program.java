import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please, enter size array");
		int sizeArray = scanner.nextInt();
		int array[] = new int[sizeArray];
		int numbers = 0;
		int maxDigits = 0;
		int minDigits = 0;
		int i = 0;
				while ( i < sizeArray) {
					numbers = scanner.nextInt();
					array[i] = numbers;
					i++;
				}
			
		System.out.print("Amount local maximum: ");
			for (i = 0; i <= sizeArray-2; i++) {  
		 		if ( i != 0) {
					if (array[i-1] < array[i]) {
						if(array[i] > array[i+1]) {
							maxDigits = maxDigits + 1;
						}
					}
				}
			} 	
		System.out.println(maxDigits);
		System.out.print("Amount local minimum: ");
			for (i = 0; i <= sizeArray-2; i++) {
				if ( i != 0) {
					if (array[i-1] > array[i]) {
						if (array[i] < array[i+1]) {
							minDigits = minDigits + 1;
						}
					}
				}
			}
		System.out.println(minDigits);
	}
} 