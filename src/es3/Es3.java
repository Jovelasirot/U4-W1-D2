package es3;

import java.util.Scanner;

public class Es3 {
    public static void main (String[] args){
        System.out.println("Es3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a word");
        String word = scanner.nextLine();
        System.out.println("Phrase with commas: " + commasAdder(word));

        scanner.close();
        ;}

    public static String commasAdder(String word) {


        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char currentChar = word.charAt(i);
            result.append(currentChar);
            result.append(",");

            if (word.startsWith(":q", i))
                break;

            i++;
        }

//        for (int i = 0; i < word.length(); i++) {
//            char currentChar = word.charAt(i);
//            result.append(currentChar);
//            result.append(",");
//            if (word.substring(i).startsWith(":q")) break;
//        }

        return result.toString();
    }
}