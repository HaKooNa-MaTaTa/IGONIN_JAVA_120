package itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { /// 32

	    Scanner scanner = new Scanner(System.in);
	    char[] symbol = scanner.nextLine().toCharArray();
	    char[] result = new char[symbol.length / 2];
	    int globalCount = 0;
	    int localCount = 0;
		int value = 0;
		int tempChar = 0;
		int buffChar = 0;
		int k = 0;

		for(int i = 0; i < symbol.length - 1; i++) {
			for(int j = i + 1; j < symbol.length; j++) {
				tempChar = symbol[i];
				if(symbol[i] == symbol[j]) {
					localCount++;
				}
				else if((symbol[i] + 32) == symbol[j]) {
					localCount++;
				}
				else if((symbol[i] - 32) == symbol[j]) {
					localCount++;
				}
			}
			if(localCount > globalCount) {
				for(int g = 0; g < result.length; g++) {
					result[g] = 0;
				}
				globalCount = localCount;
				result[k] = (char)tempChar;
				k++;
			}
			else if(localCount == globalCount) {
				result[k] = (char)tempChar;
				k++;
			}
			localCount = 0;
			tempChar = 0;
		}
		for(int z = 0; z < result.length; z++) {
			if(result[z] != 0) {
				System.out.println((char)result[z]);
			}
		}
    }
}
