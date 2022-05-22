package com.Brackets;

public class Brackets {
    public boolean verifyBrackets(String text) {
        String[] letters = text.split("");
        int count = 0;
        for (String letter : letters) {
            if (count < 0) return false;
            if (letter.equals("(")) {
                count++;
            } else if (letter.equals(")")) {
                count--;
            }
        }
        return count == 0;
    }
}
