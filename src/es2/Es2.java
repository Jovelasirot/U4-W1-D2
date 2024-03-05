package es2;

import java.util.Scanner;

public class Es2 {
    public static void main (String[] args){
        System.out.println("Es2");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
        int number = scanner.nextInt();
        System.out.println(number);
        System.out.println(numberToWord(number));

        scanner.close();
        ;}

    public static String numberToWord(int x) {
        return switch (x) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "Error";
        };

    }
}
