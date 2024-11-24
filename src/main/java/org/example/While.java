package org.example;

public class While {


    public static void main(String[] args) {

        String text = "12345z78912";

        int i = 2;
        while (i < text.length()) {
            System.out.print(text.charAt(i));
            if (text.charAt(i) == 'z'){
                break;
            };
            i = i + 3;
        }

    }

}
