package itis;
// Регистрация нового пользователя

import java.util.Scanner;

public class RegistrationNewUser implements Strategy {

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        User user = new User();
        System.out.println("Please, enter your name:");
        String temp = scanner.nextLine();
        user.setName(temp);
        System.out.println("Please, enter nickname, which you want to use");
        temp = scanner.nextLine();
        user.setNickname(temp);
        System.out.println("Please, enter your password");
        temp = scanner.nextLine();
        user.setPassword(temp);
        user.setId((int)(Math.random()*1000));
    }
}
