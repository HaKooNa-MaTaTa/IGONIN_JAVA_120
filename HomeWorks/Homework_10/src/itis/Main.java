package itis;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	sortRegister sortRegister = new sortRegister();
    	SearchChar searchChar = new SearchChar();
    	OutputChar outputChar = new OutputChar();
	    Scanner scanner = new Scanner(System.in);

	    char[] symbol = scanner.nextLine().toCharArray();
	    int[] symbolResigned = new int[symbol.length];
	    int[] arrayHighRegister = new int[26];
	    int[] arrayLowRegister = new int[26];
	    int maxValueArray = 0;


		for (int i = 0; i < symbolResigned.length; i++) {
			int temp = (int)symbol[i];
			symbolResigned[i] = temp;
			if (temp > maxValueArray) {
				maxValueArray = temp;
			}
		}
		sortRegister.sortRegisterArray(symbolResigned, arrayHighRegister, arrayLowRegister);
		searchChar.searchChar(symbolResigned, arrayHighRegister, arrayLowRegister);
		outputChar.outputChar(symbolResigned);

//		System.out.println(Arrays.toString(symbol));
//		System.out.println(Arrays.toString(symbolResigned));
//		System.out.println(Arrays.toString(arrayHighRegister));
//		System.out.println(Arrays.toString(arrayLowRegister));
 //	    int[] temp = new int[maxValueArray + 1];
 	//    for (int i = 0; i < symbolResigned.length; i++) {
 	  //  	temp[symbolResigned[i]]++;
		//}
// 	    maxValueArray = 0;
// 	    int charCode = 0;
// 	    for (int i = 0; i < temp.length; i++) {
// 	    	if (temp[i] > maxValueArray) {
// 	    		maxValueArray = temp[i];
// 	    		charCode = i;
//			}
//		}
// 	    char forPrintOnDisplay = (char)charCode;
// 	    System.out.println("Char " + forPrintOnDisplay + " found " + maxValueArray);
//		for (int i = 0; i < temp.length; i++) {
//			if (temp[i] != 0) {
//
//			}
//		}
    }
}
