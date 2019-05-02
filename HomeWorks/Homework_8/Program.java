import java.util.Scanner;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true){
		System.out.print("Please enter length array: ");
		int sizeArray = scanner.nextInt();
		int array[] = new int[sizeArray];
		int i;
		System.out.println("Array: ");
		for ( i = 0; i < sizeArray; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Select operation mode: 1 - sum, 2 - gystograma, 3 - average");
		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("The sum of all the numbers in the array: " + sum(array));
		}
		if (choice == 3) {
			System.out.println("The average of massive: " + average(array));
		}
		System.out.println("To exit for program enter '-1' ");
		int runApplication = scanner.nextInt();
		if (runApplication == -1) {
			break;
		}
		}
	}
	public static int sum (int array[]) {
		int sum = 0;
		int i;
		for (i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	//public static int[] getVectorOfFrequency(int array[]) {

	//}
	public static double average(int array[]) {
		double average = (sum(array) * 1.0) / array.length;
		return average;

	}
}