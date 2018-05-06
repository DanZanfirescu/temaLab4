package com.company;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner tastatura = new Scanner(System.in);
        MetodeTemaLab4 metodeTemaLab4 = new MetodeTemaLab4();
        CozaLozaWoza cozaLozaWoza = new CozaLozaWoza();
        ExercitiiSiruri arrays = new ExercitiiSiruri();
        RandomString randomString = new RandomString();
/*
//FOR LOOP
//Problema1 Given a number, while the number is equal to or lower than 100, print the number.

        System.out.println("Indica numarul: ");
        int inputNumber = tastatura.nextInt();
        metodeTemaLab4.givenNumberWhileEqualLower100Print(inputNumber);


//Problema2 Write a java program to count backwards from a given number to a lower given number.

        System.out.println("Indica primul numar: ");
        int inputNumber1 = tastatura.nextInt();
        System.out.println("Indica al doilea numar: ");
        int inputNumber2 = tastatura.nextInt();
        System.out.println("Numaratoare inversa:");
        metodeTemaLab4.counterBack(inputNumber1,inputNumber2);
        System.out.println(" ");


/*Problema3 Write a Java program by using two for loops to produce the output shown below:
*******
******
*****
****
***
**
*


        metodeTemaLab4.starsPrint();
        System.out.println(" ");

//Problema4 Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.

        System.out.println("Suma si media numerelor de la 1 la 100 cu metoda FOR:");
        metodeTemaLab4.sumAndAverageVariantaFor();
        System.out.println(" ");

//WHILE LOOP
//Problema1 Modify previous ex 4. to use “while-do” loop instead of “for” loop.

        System.out.println("Suma si media numerelor de la 1 la 100 cu metoda WHILE:");
        metodeTemaLab4.sumAndAverageVariantaWhile();
        System.out.println(" ");

//Problema2 Modify the program to use a "do-while" loop.

        System.out.println("Suma si media numerelor de la 1 la 100 cu metoda DO WHILE:");
        metodeTemaLab4.sumAndAverageVariantaDoWhile();
        System.out.println(" ");

//Problema3 Modify the program to sum from 111 to 8899, and compute the average. Introduce
//an int variable called count to count the numbers in the specified range.

        System.out.println("Suma si media numerelor de la 111 la 8899:");
        metodeTemaLab4.sumAndAverage111to8899();
        System.out.println(" ");

//Problema4 Write a program to sum only the odd numbers from 1 to 100, and compute the average.

        System.out.println("Suma si media numerelor impare de la 1 la 100:");
        metodeTemaLab4.sumAndAverageOddNumbers1to100();
        System.out.println(" ");

//Problema5 Write a program to sum those numbers from 1 to 100 that is divisible by 7, and compute the average.

        System.out.println("Suma si media numerelor de la l la 100 divizibile cu 7:");
        metodeTemaLab4.sumAndAverageDivizibleBy7From1to100();
        System.out.println(" ");

//Problema6 Write the program do display the first 20 Fibonacci numbers.
        System.out.println("Primele 20 de numere din sirul lui Fibonacii:");
        metodeTemaLab4.first20FibonacciNumbers();
        System.out.println(" ");

//Problema7 Write a program called CozaLozaWoza which prints the numbers 1 to 110, 11 numbers per line.
//          The program shall print "Coza" in place of the numbers which are multiples of 3, "Loza" for
//          multiples of 5, "Woza" for multiples of 7, "CozaLoza" for multiples of 3 and 5, and so on.

        System.out.println("COZA LOZA WOZA ");
        cozaLozaWoza.cozaLozaWoza();
        System.out.println("  ");



//ARRAYS
//Problema1 Define and write the values of an array indices, so that the values of the arrays should start from 1 and count to 100

        System.out.println();arrays.printSirDeLa1La100();
        System.out.println(" ");

//Problema2 Write a Java program to calculate the average value of array elements.

        System.out.println("Media elementelor sirului este: " + arrays.averageOfArray());
        System.out.println(" ");

//Problema3 Write a Java program to test if an array contains a specific value.

        System.out.println("Indica valoarea: ");
        int userInputValue = tastatura.nextInt();
        System.out.println(arrays.checkValue(userInputValue));
        System.out.println(" ");

//Problema4 Write a Java program to find the index of an array element.

        System.out.println("Indica elementul: ");
        int userInputElement = tastatura.nextInt();
        System.out.println("Indexul elementului " + userInputElement + " este " + arrays.showIndex(userInputElement) + ".");
        System.out.println(" ");

//Problema5 Write a Java program to remove a specific element from an array.

        System.out.println("Indica indexul elementului pe care vrei sa-l scoti: ");
        int userInputElementRemove = tastatura.nextInt();
        arrays.removeElement(userInputElementRemove);

*/
    randomString.firstName();
    randomString.lastName();
    randomString.password();
    }
}



