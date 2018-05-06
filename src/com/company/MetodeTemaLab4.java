package com.company;

public class MetodeTemaLab4 {


//Problema1
    public void givenNumberWhileEqualLower100Print(int inputNumber) {
        if(inputNumber<=100){
        System.out.println(inputNumber);
        }
    }


//Problema2
    public void counterBack (int inputNumber1, int inputNumber2){
        int i = inputNumber1;
        for(i = inputNumber1; i >= inputNumber2; i--){
            System.out.print(" " + i);
        }

    }


    //Problema3
    public void starsPrint() {
        String star = "*";
        int verticala;
        int orizontala;
        for (verticala = 7; verticala >= 1; verticala--) {
            for (orizontala = 1; orizontala <= verticala; orizontala++) {
                System.out.print(star);
            }
            System.out.println();
        }

    }

    //Problema4
    public void sumAndAverageVariantaFor() {
        double sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
            counter = counter + 1; //se incremeteaza odata cu for-ul si imi spune de cate ori s-a executat for-ul
        }
        System.out.println("Sum = " + sum);
        double average = sum / counter;
        System.out.println("Average = " + average);
    }

    //WHILE LOOP
    //Problema1
    public void sumAndAverageVariantaWhile() {
        double sum = 0;
        int number = 1;
        int counter = 0;
        while (number <= 100) {
            sum = sum + number;
            number = number + 1;
            counter = counter + 1;
        }
        System.out.println("Sum = " + sum);
        double average = sum / counter;
        System.out.println("Average = " + average);
    }

    //Problema2
    public void sumAndAverageVariantaDoWhile() {
        int number = 1;
        double sum = 0;
        int counter = 0;
        do {
            sum = sum + number;
            number = number + 1;
            counter = counter + 1;
        }
        while (number <= 100);
        System.out.println("Sum = " + sum);
        double average = sum / counter;
        System.out.println("Average = " + average);
    }

    //Problema3
    public void sumAndAverage111to8899() {
        int sum = 0;
        double counter = 0;
        for (int i = 111; i <= 8899; i++) {
            sum = sum + i;
            counter = counter + 1; //se incremeteaza odata cu for-ul si imi spune de cate ori s-a executat for-ul
        }
        System.out.println("Sum = " + sum);
        double average = sum / counter;
        System.out.println("Average = " + average);
    }

    //Problema4
    public void sumAndAverageOddNumbers1to100() {
        int sum = 0;
        double counter = 0;
        for (int i = 1; i <= 100; i = i + 2) {
            sum = sum + i;
            counter = counter + 1; //se incremeteaza odata cu for-ul si imi spune de cate ori s-a executat for-ul
        }
        System.out.println("Sum = " + sum);
        double average = sum / counter;
        System.out.println("Average = " + average);
    }

    //Problema5
    public void sumAndAverageDivizibleBy7From1to100() {
        int sum = 0;
        double counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) {
                sum = sum + i;
                counter = counter + 1;
            }
        }
        System.out.println("Sum = " + sum);
        double average = sum / counter;
        System.out.println("Average = " + average);
    }

    //Problema6
    public void first20FibonacciNumbers() {
        int f0 = 0;
        int f1 = 1;
        System.out.print(" " + f0 + " ");
        System.out.print(" " + f1 + " ");
        int f2;
        for (int i = 2; i <= 19; i++) {
            f2 = f1 + f0;
            f0 = f1;
            f1 = f2;
            System.out.print(" " + f2 + " ");
        }
        System.out.println(" ");
    }
}