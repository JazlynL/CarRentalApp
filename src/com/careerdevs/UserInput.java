package com.careerdevs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private static Scanner scan = new Scanner(System.in);

    public static String readString(String question) {
        System.out.println(question + "\n");
        return scan.nextLine();

    }

    public static int readInt(String question, int min, int max) {


        while (true) {

            try {
                System.out.println(question);
                System.out.println("Number " + "( " + min +"-"+ max + " ): ");
                int userInt = scan.nextInt();
                scan.nextLine();
                if (userInt >= min && userInt <= max) {
                    return userInt;
                }
                System.out.println("Whoa selection is out of range, insert again");
                return readInt(question, min, max);
//            scan.nextLine();
            } catch(InputMismatchException exception){
                scan.nextLine();
                System.out.println("Invalid input");
                return readInt(question, min, max);

            }
//
//        Scanner scan = new Scanner(System.in);

//        System.out.println("User selected " + userInput);

        }
    }
}
