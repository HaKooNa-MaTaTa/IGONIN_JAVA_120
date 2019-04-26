import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int chislo = 0;
		int digits1 = 0;
		int digits2 = 0;
		int digits3 = 0;
		int digits4 = 0;
		int digits5 = 0;
		int digits6 = 0;
		int digits7 = 0;
		int digits8 = 0;
		int digits9 = 0;
		List <Integer> numbers = new ArrayList <>();
		
			while (chislo != -1) {
			chislo = scanner.nextInt();
			numbers.add(chislo);
			int filter = 0;

			while (chislo > 0) {
				filter = chislo%10;
				chislo = chislo/10;

				if (filter == 1) {
					digits1++;
				}
					if (filter == 2) {
						digits2++;
					}
						if (filter == 3) {
							digits3++;
						}
							if (filter == 4) {
								digits4++;
							}
								if (filter == 5) {
									digits5++;
								}
									if (filter == 6) {
										digits6++;
									}
										if (filter == 7) {
											digits7++;
										}
											if (filter == 8) {
												digits8++;
											}
												if (filter == 9) {
													digits9++;
												}

		} 
				if (chislo == -1) {
					digits1++;
					break;
			}
		}
		System.out.println("Kolichestvo 1 = " + digits1);
		System.out.println("Kolichestvo 2 = " + digits2);
		System.out.println("Kolichestvo 3 = " + digits3);
		System.out.println("Kolichestvo 4 = " + digits4);
		System.out.println("Kolichestvo 5 = " + digits5);
		System.out.println("Kolichestvo 6 = " + digits6);
		System.out.println("Kolichestvo 7 = " + digits7);
		System.out.println("Kolichestvo 8 = " + digits8);
		System.out.println("Kolichestvo 9 = " + digits9);
	}
}

		
