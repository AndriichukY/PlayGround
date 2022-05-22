package com.VerifyBrackets;

public class Main {
    public static void main (String[] args){
        String text = ")(";
        VerifyBracketsMethod result = new VerifyBracketsMethod();
        if (result.isCorrectBrackets(text)){
            System.out.println("You have a correct brackets format!");
        } else System.out.println("Recheck brackets in text!");
    }
}
