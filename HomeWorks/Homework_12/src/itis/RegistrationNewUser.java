package itis;
// Регистрация нового пользователя


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Scanner;

public class RegistrationNewUser implements Strategy {

    @Override
    public void run() throws IOException {
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
        System.out.println("Now, you must a choice channels: " + Arrays.toString(ProgramCanalsList.canalsList));
        int tempInt;
        for (int i = 0; i < 10; i++) {
            tempInt = scanner.nextInt();
            user.setChannels(tempInt);
        }
        user.setId((int)(Math.random()*1000));
        Writer writer = new FileWriter("ListUsers.txt", true);
        String[] newUser = {user.getName(), user.getNickname(), user.getPassword(), String.valueOf(user.getId()),user.getChannels()};
        writer.write(Arrays.toString(newUser));
        writer.append('\n');
        writer.close();
    }
}
