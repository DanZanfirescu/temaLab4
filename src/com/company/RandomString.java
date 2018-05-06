package com.company;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Random;

public class RandomString {
    private char[] passwordChar = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private char[] lowerCase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private char[] upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private StringBuffer firstNameBuffer = new StringBuffer();
    private StringBuffer lastNameBuffer =new StringBuffer();
    private StringBuffer passwordBufer = new StringBuffer();
    private Random letters = new Random();
    private String firstName;
    private String lastName;
    private String password;
private Timestamp timestamp;

    public void  firstName() {

        for (int i = 0; i < 1; i++) {
            char firstLeterRandom = upperCase[letters.nextInt(upperCase.length)];
            firstNameBuffer.append(firstLeterRandom);
                for (int j = 0; j < 4; j++) {
                    char nextLetersRandom = lowerCase[letters.nextInt(lowerCase.length)];
                    firstName = firstNameBuffer.append(nextLetersRandom).toString();
            }
        }
        System.out.println(firstName);
    }
    public void  lastName() {

        for (int i = 0; i < 1; i++) {
            char firstLeterRandom = upperCase[letters.nextInt(upperCase.length)];
            lastNameBuffer.append(firstLeterRandom);
            for (int j = 0; j < 10; j++) {
                char nextLetersRandom = lowerCase[letters.nextInt(lowerCase.length)];
                lastName = lastNameBuffer.append(nextLetersRandom).toString();
            }
        }
        System.out.println(lastName);
    }

    public void password(){
        for (int j = 0; j < 10; j++) {
            char passwordRandom = passwordChar[letters.nextInt(passwordChar.length)];
            password = passwordBufer.append(passwordRandom).toString();
        }

        System.out.println(firstName+"."+lastName+"@domain.com");

    }
}

