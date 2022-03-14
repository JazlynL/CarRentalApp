package com.careerdevs.MovieRentalCLI;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class MovieService {
    //creating fields for the movie storage

//    private static ArrayList<Movie> availablemovies;
//    private ArrayList<Movie> returnedmovies;


    private static ArrayList<Movie> moviestorage;



    public static void main(String [] args){
        intializeMovieStorage();
        mainMenu();

    }
    //creating the main menu for the CLI app allowing the user to interact with
    public static  void mainMenu(){
        // A print out message for the user
        System.out.println("Welcome to the Main Menu.Today you decide on what you would like to choose for today");
        System.out.println("1.Rent a movie");
        System.out.println("2.Return a movie");
        System.out.println("3.Exit Menu");
        //we have to capture users response
        int userInput = UserInput.readInt("What is your choice ?",1,3);
        System.out.println(userInput);
        switch (userInput){
            case 1-> rentalMenu();
            case 2 ->returnMenu();
        }
        if(userInput == 3) {
            System.out.println("\n\n GoodByeUser!\n\n");
        }


    }

    public static void rentalMenu(){
        //send greeting message to user.
        System.out.println("Welcome what movie would you like to rent today? ");
        // we are setting the array list = to the method.
        ArrayList <Movie> moviesRentable = availableMovies();
        // then we set it = to the size of the array
        int moviesRented= moviesRentable.size();
        // if there is no more movies that can be rented they will be returned to the main menu.
        if(moviesRented == 0){
            System.out.println("No movies today can be rented. You are returning to the main menu.");
            return;
        }else{
            System.out.println("\n\n Available movies");
            for(int i = 0 ; i < moviesRented;i++){

                // outputting available movies
                System.out.println("("+(i+1)+")"+ moviesRentable.get(i).getTitle());
            }

            // setting the option of menu return
            System.out.println("("+ (moviesRented +1) +")"+" return to menu");
            // allowing the user to choose the movie if not return to main menu.
            int userMovieChoice = UserInput.readInt("What Movie did you want ?", 1, moviesRented+1);

            // allowing user to return to the main menu
            if(userMovieChoice == moviesRented+1){
            System.out.println("("+moviesRented+1+")"+"We are bringing you back to the main menu");
            return;
            }

            //capturing user response and reflecting it in the program itself.
            System.out.println("You decide on "+ moviesRentable.get(userMovieChoice-1).getTitle());
            moviesRentable.get(userMovieChoice-1).setRentedMovie(true);


        }

    }
    // creating a method to signify available movies
    public static ArrayList<Movie> availableMovies(){
        // creating a new instance of the available movies
        ArrayList <Movie> moviesAvailable = new ArrayList<>();
        //creating a for loop to iterate through the movies available
        for(int i = 0 ; i < moviestorage.size();i++){
            // if it is not equal to the false boolean  add all the movie storage to movies available
            if(!moviestorage.get(i).isRentedMovie()){
                moviesAvailable.add(moviestorage.get(i));
            }
            //return the value

        }
        return moviesAvailable;
    }



    public static void returnMenu(){
            System.out.println();
        }


        // creating a method for the rented movies

    public static ArrayList<Movie> returnedMovies() {
        // create a new instance of the array list
        ArrayList<Movie> rentedMovies = new ArrayList<>();
        // create a for loop to iterate through the movie storage once again
        for (int i = 0; i < moviestorage.size(); i++) {
            if (moviestorage.get(i).isRentedMovie()) {
                //we are intializing the conditional and setting it too the rented movies storage
                rentedMovies.add(moviestorage.get(i));
            }

        }
        return rentedMovies;

    }


    public static void intializeMovieStorage(){
        // we are instantiating a new array list to be made.
        moviestorage =new ArrayList<>();

        // intializing the movie data that will be available to users.
        Movie movie1 = new Movie("Horror","Jeepers Creepers",false);
        Movie movie2 = new Movie("Comedy","Cheaper By The Dozen",false);
        Movie movie3 = new Movie("Horror","Thirteen Ghost",false);
        Movie movie4 = new Movie("Thrillers","Pursuit of Happiness",false);
        // adding the movies to movie storage using the add all method
        moviestorage.addAll(List.of(new Movie[]{movie1,movie2,movie3,movie4}));

    }


}
