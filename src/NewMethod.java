public class NewMethod {
    static void myMethod(String text) {
        //String [] vowels= {"a", "e", "o", "i", "u", "y"};
        char[] vowels = {'a', 'e', 'o', 'i', 'u', 'y'};
        for (int i = 0; i < text.length(); i++) {
            char x = text.charAt(i);
            for (int im = 0; im < vowels.length; im++) {
                if (x == vowels[im]) {
                    System.out.println(x);
                }
            }
        }
    }
    static void myMethod2(String text2){
        for (int recurs=text2.length()-1; recurs>=0; recurs--){
            char x = text2.charAt(recurs);
            System.out.print(x);
        }

    }
    }

    /*static void myMethod2(String text2){
        for (int i = 0; i<text2.length(); i++){
            char x = text2.charAt(i);
            for (int recurs=text2.lastIndexOf(i); recurs==0; recurs--){
                System.out.print(recurs);
            }

        }
    }*/


