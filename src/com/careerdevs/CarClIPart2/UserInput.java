package com.careerdevs.CarClIPart2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    private  static Scanner scanny = new Scanner(System.in);

    public static int readInt( String question,int min, int max){
        while (true) {
            try {
                System.out.println(question);
                System.out.println("Number " + "( " + min + "-" + max + " )");
                int userInput = scanny.nextInt();
                if (userInput >= min && userInput <= max) {
                    return userInput;

                }
                System.out.println("Whoa selection is out of range, insert again");
                return readInt(question, min, max);

            }
            catch(InputMismatchException exception){
                scanny.nextLine();
                System.out.println("invalid input");
                return readInt(question, min, max);



            }

        }
    }
    public static String lineSpacer(){
        return "-_-".repeat(15);
    }
}
