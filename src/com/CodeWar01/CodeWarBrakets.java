package com.CodeWar01;

public class CodeWarBrakets {

    static String encode(String word){
        word= word.toLowerCase();
        StringBuilder braketOfSymbol = new StringBuilder();

        for (int i=0; i<word.length(); i++){
            char symbol=word.charAt(i);
            int count=0;

            for (int verifySymbol=0; verifySymbol<word.length();verifySymbol++){
                if(word.charAt(verifySymbol)==symbol){
                   count++;
                }
            }
            if(count==1){
                braketOfSymbol.append("(");
            } else {
                braketOfSymbol.append(")");
            }
        }
        return braketOfSymbol.toString();
    }
}
