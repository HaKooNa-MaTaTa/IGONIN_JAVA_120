package itis;
// Это класс отвечающий за главное меню
import java.util.Scanner;

public class Menu {
    public void run() {

        Registration choiceAtype = new Registration();
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Hello, subscriber OOO 'Red Vityaz'");
        System.out.println("Please, choice your action:");
        System.out.println("1" + ". " + "Connect TV");
        System.out.println("2" + ". " + "I have account in this service");
        System.out.println("3" + ". " + "Finish the service");

        String choice = scanner.nextLine();

        if ((choice == "1") || (choice == "Connect TV")) {
            choiceAtype.setStrategy(new RegistrationNewUser());
            choiceAtype.registration();
        }
        else if ((choice == "2") || (choice == "I have account in this service")) {
            choiceAtype.setStrategy(new LogInExistingUser());
            choiceAtype.registration();
        }
        else if ((choice == "3") || (choice == "Finish the service")) {
            return;
        }
    }
}
