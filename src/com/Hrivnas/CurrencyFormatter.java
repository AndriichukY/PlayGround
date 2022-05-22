package com.Hrivnas;

import java.lang.reflect.Array;

public class CurrencyFormatter {
    public String formatUah(int amount) {
        String amountAsString = String.valueOf(amount);

        if (amountAsString.length() >= 2) {
            return countHrn2(amountAsString);
        }

        return countHrn3(amountAsString);
    }

    public String countHrn2(String amount) {
        String result;
        String lastTwoChars = amount.substring(amount.length() - 2);

        if (lastTwoChars.equals("11")
                || lastTwoChars.equals("12")
                || lastTwoChars.equals("13")
                || lastTwoChars.equals("14")) {
            result = " гривень";
        } else {
            return countHrn3(amount);
        }

        return amount + result;
    }

    public String countHrn3(String amount) {
        String result;
        String lastOneChar = amount.substring(amount.length() - 1);

        if (lastOneChar.equals("0")
                || lastOneChar.equals("5")
                || lastOneChar.equals("6")
                || lastOneChar.equals("7")
                || lastOneChar.equals("8")
                || lastOneChar.equals("9")) {
            result = " гривень";
        } else if (lastOneChar.equals("1")) {
            result = " гривня";
        } else {
            result = " гривні";
        }

        return amount + result;
    }
}