package itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        Logger logger = Logger.setPrefix();
        logger.setPreFix("MESSAGE");
        logger.log(message);
    }
}
