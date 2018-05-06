package com.company;

import java.util.Arrays;



public class ExercitiiSiruri {
    //Problema1 Definirea sirului si atribuirea valorilor indecsilor de la 1 la 100
    public int[] array1To100() {
        int[] sirDeLa1La100 = new int[100];
        for (int i = 0; i < sirDeLa1La100.length; i++) {
            sirDeLa1La100[i] = i + 1;
        }
        return sirDeLa1La100;
    }

    //Problema1 Tiparirea valorilor sirului anterior creat
    public void printSirDeLa1La100() {
        System.out.println("Valorile sirului sunt: ");
        System.out.println(Arrays.toString(array1To100()));
    }


    int[] sirDeLa1La100 = array1To100();


    //Problema2 Metoda de calcul a mediei elementelor sirului anterior creat
    public double averageOfArray() {
        double sum = 0;
        double average = 0;
        int i;
        for (i = 0; i < sirDeLa1La100.length; i++) {
            sum = sum + sirDeLa1La100[i];
        }
        average = sum / sirDeLa1La100.length;
        return average;
    }

    //Problema3 Metoda prin care se stabileste daca sirul contine o anumita valoare
    public String checkValue(int userInputValue) {
        int i;
        for(i=0; i<sirDeLa1La100.length; i++) {
            if (userInputValue == sirDeLa1La100[i]) {
                return String.valueOf(userInputValue) + " apartine sirului.";
            }
        }
        return String.valueOf(userInputValue) + " nu apartine sirului.";
    }


    //Problema4 Metoda prin care se determina indexul unui element
    public int showIndex(int userInputElement){
        int i;
        for(i=0; i<sirDeLa1La100.length; i++) {
            if (userInputElement == sirDeLa1La100[i]) {
                return i;
            }
        }
        return -1;
    }


    //Problema5 Metoda prin care se scoate un element din sir
    public void removeElement (int userInputElementToRemove){
        int i;
        for(i=userInputElementToRemove; i<sirDeLa1La100.length-1; i++) {
            sirDeLa1La100[i] = sirDeLa1La100[i + 1];
        }
        System.out.println(Arrays.toString(sirDeLa1La100));
    }
}