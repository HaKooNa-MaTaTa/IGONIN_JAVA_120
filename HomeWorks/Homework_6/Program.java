import java.util.Scanner;


class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numbers = 0;
		int length = 0;
		System.out.print("Vvedite dlinu massiva: ");
		length = scanner.nextInt();
		int array[] = new int[length];
		int i = 0;
		int index_max = 0;
		int index_min = 0;
		int max_number = 0;
		int min_number = 0;

		while (i < length) {
			array[i] = scanner.nextInt();
			if (i == 0) {
				min_number = array[i];
				max_number = array[i];
			}

			if (array[i] < min_number) {
				min_number = array[i];
				index_min = i;
			}
			if (array[i] > max_number) {
				max_number = array[i];
				index_max = i;
			}
			i++;
		}
		System.out.print("Soderzhimoe massiva do izmeneniya: ");
		for (i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		System.out.println("Maximalnoe chislo i ego index: " + max_number + " [" + index_max + "]");
		System.out.println("Minimalnoe chislo i ego index: " + min_number + " [" + index_min + "]");
		array[index_min] = max_number;
		array[index_max] = min_number;
		System.out.print("Soderzhimoe massiva posle izmeneniya: ");
		for (i = 0; i < length; i++) {
			System.out.print(array[i] + " ");

	}

}
}