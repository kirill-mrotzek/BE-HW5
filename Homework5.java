package com.telran.org.Homework;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = isEdekaOpen && isReweOpen;

        if (isEdekaOpen && isReweOpen) {

            System.out.println("Я могу купить еду, это " + canBuy);
        }else{
            System.out.println("Я не могу купить еду");
        }

        checkLeapYear();
        checkNumber();
    }

    private static boolean canBuy(boolean isEdekaOpen, boolean isReweOpen) {
        return isEdekaOpen ||  isReweOpen;
    }

    public static void checkLeapYear(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a year : ");
        int year = scanner.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("This is a leap year");
        }else{
            System.out.println("This is not a leap year");
        }
    }

    public static void checkNumber(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int numberOne = scanner.nextInt();
        System.out.println("Plese enter the second number : ");
        int numberTwo = scanner.nextInt();
        System.out.println("Please enter the third number : ");
        int numberThree = scanner.nextInt();

        if(numberOne > numberTwo && numberOne > numberThree){
            System.out.println("The largest number is : " + numberOne);
        }else if(numberTwo > numberOne && numberTwo > numberThree){
            System.out.println("The largest number is : " + numberTwo);
        }else if(numberThree > numberOne && numberThree > numberTwo){
            System.out.println("The largest number is : " + numberThree);
        }
        scanner.close();
    }
}


