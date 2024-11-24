package org.example;

public class Main {
    public static void main(String[] args) {

        int [] number = {1, 3, 17, 5, 8, 4};

        int count = 0;

        for (int i = 0 ; i < number.length ; i ++) {
            if (number [i] % 2 == 0){
                count ++;
            }
        }

        if (count == 0){
                System.out.println("მასივში არ არის ლუწი რიცხვი");
        }
        else
        System.out.println("ამ მასივში არის " + count + " ლუწი რიცხვი");

    }


}

