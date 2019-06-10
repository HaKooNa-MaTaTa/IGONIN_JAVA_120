package itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { /// 32

	    Scanner scanner = new Scanner(System.in);
	    char[] symbol = scanner.nextLine().toCharArray();
	    int[] result = new int[26];
		int temp = 0;
		int maxValue = 0;
		char[] oftenFoundChar = new char[symbol.length];
		int k = 0;
	    for (int i = 0; i < symbol.length; i++) {
	    	temp = (int)symbol[i];
	    	if (temp < 91) {
	    		result[temp - 65]++;
			}
	    	else if (temp > 96) {
	    		result[temp - 97]++;
			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] > maxValue) {
				k = 0;
				for (int j = 0; j < oftenFoundChar.length; j++) {
					oftenFoundChar[j] = ' ';
				}
				maxValue = result[i];
				oftenFoundChar[k] = (char)(i + 65);
			}
			else if (result[i] == maxValue) {
				k++;
				oftenFoundChar[k] = (char)(i + 65);
			}
		}
		for (int i = 0; i < oftenFoundChar.length; i++) {
			if (oftenFoundChar[i] != ' ') {
				System.out.println(oftenFoundChar[i]);
			}
		}
    }
}
