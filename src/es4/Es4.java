package es4;

import java.util.Scanner;

public class Es4 {
    public static void main (String[] args){
        System.out.println("Es4");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a number");
int x = scanner.nextInt();
        System.out.println("CountDown from " + x);
     countDown(x);

        scanner.close();
        ;}

    public static void countDown(int num){
        for (int i = num; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
