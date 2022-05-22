package com.Hrivnas;

public class Main {
    public static void main(String[] args) {
        CurrencyFormatter word = new CurrencyFormatter();
        String input="-1234";

       // System.out.println(input.substring(input.length()-2).equals("34"));
        /*word.countHrn(2);
        word.countHrn(3);
        word.countHrn(4);
        word.countHrn(5);
        word.countHrn(11);
        word.countHrn(12);
        word.countHrn(13);
        word.countHrn(14);
        word.countHrn(17);
        word.countHrn(99);
        word.countHrn(111);
        word.countHrn(1012);
        word.countHrn(1013);
        word.countHrn(1014);
        word.countHrn(2014);
        word.countHrn(1016);
        word.countHrn(105);
        word.countHrn(103);
        word.countHrn(110);
        word.countHrn(512);
        word.countHrn(1002);
        word.countHrn(1501);
        word.countHrn(0);
        word.countHrn(1);
        word.countHrn(1200);
        word.countHrn(100);
        word.countHrn(6);
        word.countHrn(7);
        word.countHrn(8);
        word.countHrn(9);*/
        System.out.println(word.formatUah(111));
        System.out.println(word.formatUah(2));
        System.out.println(word.formatUah(3));
        System.out.println(word.formatUah(4));
        System.out.println(word.formatUah(5));
        System.out.println(word.formatUah(6));
        System.out.println(word.formatUah(7));
        System.out.println(word.formatUah(8));
        System.out.println(word.formatUah(9));
        System.out.println(word.formatUah(10));
        System.out.println(word.formatUah(0));
        System.out.println(word.formatUah(11));
        System.out.println(word.formatUah(12));
        System.out.println(word.formatUah(13));
        System.out.println(word.formatUah(14));
        System.out.println(word.formatUah(15));
        System.out.println(word.formatUah(33));
        System.out.println(word.formatUah(133));
        System.out.println(word.formatUah(100));
        System.out.println(word.formatUah(113));
        System.out.println(word.formatUah(-11));
        System.out.println(word.formatUah(-33));
        System.out.println(word.formatUah(-43));
        System.out.println(word.formatUah(555));
        System.out.println(word.formatUah(-100000001));

    }
}
