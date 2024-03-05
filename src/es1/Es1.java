package es1;

import java.util.Scanner;

public class Es1 {
    public static void main (String[] args){
        System.out.println("Es1");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        String x = scanner.nextLine();
        System.out.println("Is it an even number? " + stringEvenOdd(x));

        System.out.println("Write a year");
        int year = scanner.nextInt();
        System.out.println("Is it a leap year? " + leapYear(year));


        scanner.close();
        ;}

    public static  Boolean stringEvenOdd(String num) {
        int number = Integer.parseInt(num);
        return number % 2 == 0;
    }
public static Boolean leapYear(int year) {
    if (year % 4 == 0) {
        return (year % 100 != 0) || (year % 400 == 0);
    } else {
        return false;
    }
}
}
