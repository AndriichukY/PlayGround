package com.MaxNumber;

public class Main {
    public static void main(String[] args) {
        MaxNumberMethod newObjectMax = new MaxNumberMethod();
        MaxNumberMethod newObjectMin = new MaxNumberMethod();
        int [] numbers= {-1, 0, -5, 100, 100, 100,-99};
        System.out.println(newObjectMax.countMax(numbers));
        System.out.println( newObjectMin.countMin(numbers));
    }
}
