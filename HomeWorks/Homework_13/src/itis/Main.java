package itis;

import itis.Players.PlayerFirstLvl;

import java.io.BufferedOutputStream;
import java.io.FileWriter;
import java.io.Writer;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PlayerFirstLvl playerFirstLvl = new PlayerFirstLvl();
        System.out.println("Please, enter name your character");
        String buffTemp = scanner.nextLine();
        playerFirstLvl.setName(buffTemp);
        Writer writer = new FileWriter("C:\\Users\\ASUS\\Desktop\\IGONIN_JAVA_120\\HomeWorks\\Homework_13\\src\\itis\\Saves\\SaveFile.txt", true);
        writer.write(playerFirstLvl.getName());
        writer.append('\n');
        writer.close();
    }
}
