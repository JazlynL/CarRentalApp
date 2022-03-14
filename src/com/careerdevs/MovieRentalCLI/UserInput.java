package com.careerdevs.MovieRentalCLI;


import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    // instantiating a scanner class to read user input
    private static Scanner scan = new Scanner(System.in);


    // creating a method to record user response
    public static int readInt(String question, int min, int max) {
        while (true) {
            try {
                // print out the question for the user
                System.out.println(question);
                System.out.println("number"+ "(" + min +"-"+ max + ")");
                //using the scanner var that was assigned to the Scanner class to grab user response
                int userResponse = scan.nextInt();
                //setting the condition for the user response.
                if (userResponse >= min && userResponse <= max) {
                    return userResponse;
                }
                System.out.println("selection out of range");
                //setting the loop to revert back to the userresponse
                return readInt(question, min, max);
            }
            // catching the user error.
            catch(InputMismatchException e){
                scan.nextLine();
                System.out.println("\n\nYou're selection was out of range.");
                return readInt(question, min, max);

            }
        }
    }
}