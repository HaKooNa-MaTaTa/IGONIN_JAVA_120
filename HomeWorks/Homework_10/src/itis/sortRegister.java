package itis;

public class sortRegister {
    public void sortRegisterArray(int[] arrayOriginal, int[] arrayHighRegister, int[] arrayLowRegister) {
        int h = 0, l = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if ((arrayOriginal[i] > 64) && (arrayOriginal[i] < 91)) {
                while (65 != (arrayOriginal[i] - h)) {
                    h++;
                }
                arrayHighRegister[h]++;
            } else if((arrayOriginal[i] > 96) && (arrayOriginal[i] < 123)) {
                while (97 != (arrayOriginal[i] - l)) {
                    l++;
                }
                arrayLowRegister[l]++;
            }
            else {
                i++;
            }
        }
    }
}
