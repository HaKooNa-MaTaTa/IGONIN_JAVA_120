package itis;


import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;

class Test {
    public static void main(String[] args) throws IOException{
        InputStream inputStream = new FileInputStream("C:\\Users\\ASUS\\Desktop\\IGONIN_JAVA_120\\HomeWorks\\Homework_12\\src\\itis\\input.txt");
        byte[] bytes = new byte[100];
        int count = inputStream.read(bytes);
        for (int i = 0; i < bytes.length; i++) {
            System.out.print((char)bytes[i]);
        }
    }
}
