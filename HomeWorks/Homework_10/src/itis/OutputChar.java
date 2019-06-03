package itis;

public class OutputChar {
    public void outputChar(int[] finalArray) {
        for (int i = 0; i < finalArray.length; i++) {
            if (finalArray[i] > 0) {
                System.out.println("Char " + ((char)(65 + i)) + " found " + finalArray[i] + " times");
            }
        }
    }
}
