package com.MaxNumber;

public class MaxNumberMethod {

    public int countMax(int[] numbers) {
        int iMax = numbers[0];
        for (int x = 0; x < numbers.length; x++) {
            if (numbers[x] > iMax) {
                iMax = numbers[x];
            }
        }
        return iMax;
    }

    public int countMin(int[] numbers) {
        int iMin = numbers[0];
        for (int y = 0; y < numbers.length; y++) {
                if (numbers[y] < iMin) {
                    iMin = numbers[y];
                }
            }
        return iMin;
    }


   /* public int countMax (int [] numbers){
        int iMax=0;
        for (int x=0; x<numbers.length; x++){
            if (numbers[x]>iMax){
                iMax=numbers[x];
            }
        }
        return iMax;
    }*/
}
