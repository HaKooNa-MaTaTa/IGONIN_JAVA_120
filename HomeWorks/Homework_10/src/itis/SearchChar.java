package itis;

public class SearchChar {
    public int[] searchChar(int[] finalArray, int[] arrayHighRegister, int[] arrayLowRegister) {
        int[] tempArray = new int[26];
        int tempValue = 0;
        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = 0;
        }
        for (int i = 0; i < arrayHighRegister.length; i++) {
            tempArray[i] = arrayHighRegister[i] + arrayLowRegister[i];
        }
        for (int i = 0; i < tempArray.length; i++ ) {
            if (tempArray[i] > tempValue) {
                for (int r = 0; r < finalArray.length; r++) {
                    finalArray[r] = 0;
                }
                tempValue = tempArray[i];
                finalArray[i] = tempValue;
            } else if (tempArray[i] == tempValue) {
                finalArray[i] = tempValue;
            }
        }
        return finalArray;
    }
}
