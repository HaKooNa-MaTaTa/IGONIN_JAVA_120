import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size_array = scanner.nextInt();
		int array[] = new int[size_array];
		int max_array[] = new int[size_array];
		int numbers = 0;
		int min_array[] = new int[size_array];
		int max_digits = 0;
		int i = 0;
				while ( i < size_array) {
					numbers = scanner.nextInt();
					array[i] = numbers;
					i++;
				}
			
		System.out.print("Lokalnie maximumi: ");
			for (i = 0; i <= size_array-2; i++) {  
		 		if ( i != 0) {
					if (array[i-1] < array[i]) {
						if(array[i] > array[i+1]) {
							max_array[i-1] = array[i];
						}
							if (max_array[i-1] != 0){
								System.out.print(max_array[i-1] + ", ");
							}
					}
		
				}
			} 	

		System.out.println(" ");
		System.out.print("Lokalnie minimumi: ");
			for (i = 0; i <= size_array-2; i++) {
				if ( i != 0) {
					if (array[i-1] > array[i]) {
						if (array[i] < array[i+1]) {
							min_array[i-1] = array[i];
							if (min_array[i-1] != 0) {
								System.out.print(min_array[i-1] + ", ");
							}
						}
					}
				}
			}

	}
} 