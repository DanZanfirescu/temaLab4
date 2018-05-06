package com.company;

public class CozaLozaWoza {
    public void cozaLozaWoza (){
        int counter = 0;
        for (int i=1; i<=110; i++){
            counter=counter+1;
            if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0){
                System.out.print(" Coza ");
            }
            else if (i % 3 != 0  && i % 5 == 0  && i % 7 != 0){
                System.out.print(" Loza ");
            }
            else if (i % 3 != 0  && i % 5 != 0  && i % 7 == 0){
                System.out.print(" Woza ");
            }
            else if (i % 3 ==0 && i % 5 ==0 && i % 7 != 0){
                System.out.print(" CozaLoza ");
            }
            else if (i % 3 ==0 && i % 5 !=0 && i % 7 == 0){
                System.out.print(" CozaWoza ");
            }
            else if (i % 3 != 0 && i % 5 == 0 && i % 7 == 0){
                System.out.print(" LozaWoza ");
            }
            else if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0){
                System.out.print(" CozaLozaWoza ");
            }
            else {
                System.out.print(" " + i + " ");
            }
            if (counter % 11==0){
                System.out.println(" ");
           }
        }
    }
}
