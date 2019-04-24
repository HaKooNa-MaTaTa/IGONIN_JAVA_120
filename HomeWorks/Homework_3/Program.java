
import java.util.Scanner;

class Program {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt(); // vvodim chislo dlya summi

		int amount_number = 0; // kolichestvo cifr v chisle
		int number_sravneniya = 1; // peremennaya dlya sravneniya
		int sum_peremennih = 0; // peremennaya dlya summi cifr
	while (number >= number_sravneniya) { // poka chislo, kotoroe vvel user >= chisla dlya sravneniya, to
			number_sravneniya = number_sravneniya * 10; // uvelichivaem chislo dlya sravneniya na 10
	    	amount_number = amount_number + 1; // a peremennuyou dlya kolichestva cifr uvelichivaem na 1
	}

	while (amount_number != 0) { // poka peremennaya kolichestva cifr ne ravna 0, vipolnyaem
			number_sravneniya = number_sravneniya / 10; // peremennuyou dlya sravneniya delim na 10
		int peremennaya = number / number_sravneniya; // vvedennoe chislo delim na peremennuyou sravneniya
			number = number % number_sravneniya; // izbavlyaemsya ot pervoi cifri chisla
			sum_peremennih = sum_peremennih + peremennaya; // summiruem
			amount_number = amount_number - 1; // peremennuyou dlya kolichestva cifr umenshaem na odin
			} System.out.println(sum_peremennih); // vivodim summu cifr

		int two_last_digits_sum = sum_peremennih % 100; // nahodim dve poslednih cifri
		int last_digits_sum = two_last_digits_sum % 10; // nahodim poslednyouyou cifru
		int before_last_digits_sum = two_last_digits_sum / 10; // nahodim predposlednyouyou cifru
		int sum_digits_sum = before_last_digits_sum + last_digits_sum;
		


		int number_x = scanner.nextInt(); // vvodim chislo dlya peremnozheniya
		int two_last_digits_x = number_x % 100; // nahodim dve poslednih cifri
		int last_digits_x = two_last_digits_x % 10; // nahodim poslednyouyou cifru
		int before_last_digits_x = two_last_digits_x / 10; // nahodim predposlednyouyou cifru
		int sum_digits_x = last_digits_x + before_last_digits_x; // nahodim summu etih cifr
		

	while((sum_digits_sum % 2 == 1) && (sum_digits_x % 2 == 0)) {

			System.out.println("Please, repeat input");
			number_x = scanner.nextInt();

		two_last_digits_x = number_x % 100; // nahodim dve poslednih cifri
		last_digits_x = two_last_digits_x % 10; // nahodim poslednyouyou cifru
		before_last_digits_x = two_last_digits_x / 10; // nahodim predposlednyouyou cifru
		sum_digits_x = last_digits_x + before_last_digits_x; // nahodim summu etih cifr
		} 
	

		int amount_number_x = 0;  // kolichestvo cifr v chisle
		int number_sravneniya_x = 1; // peremennaya dlya sravneniya
		int x_peremennih = 1; // peremennaya dlya zapisi cifr
	while (number_x >= number_sravneniya_x) { // poka vvedennoe chislo >= peremennoi sravneniya, to
			number_sravneniya_x = number_sravneniya_x * 10; // umnozhaem peremennuyou sravneniya na 10
			amount_number_x = amount_number_x + 1; // uvelichivaem peremennuyou kolichestva cifr na 1
		}
	while (amount_number_x != 0) { // poka kolichestvo cifr ne ravno 0, to
			number_sravneniya_x = number_sravneniya_x / 10; // peremennuyou dlya sravneniya delim na 10
		int peremennaya_x = number_x / number_sravneniya_x; // vvedennoe chislo delim na peremennuyou sravneniya
			number_x = number_x % number_sravneniya_x; // izbavlyaemsya ot pervoi cifri chisla
			x_peremennih = x_peremennih * peremennaya_x; // peremnozhaem cifri chisla
			amount_number_x = amount_number_x - 1; // umenshaem peremennuyou kolichestva cifr na odin
		} System.out.println(x_peremennih); // vivodim resultat na ekran
	}
}