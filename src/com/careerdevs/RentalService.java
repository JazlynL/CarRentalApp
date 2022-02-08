package com.careerdevs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RentalService {
     private static ArrayList<Car> carStorage;
     private static ArrayList <Car> availableCars;
     private static ArrayList <Car> rentedCars;


    public static void main(String[] args) {
//
//        ArrayList <Car> availableCars = new ArrayList<>();
//        ArrayList <Car> rentedCars = new ArrayList<>();
        // write your code here


//        carStorage.get(1).setRented(true);


        //Create list Array

//        Car[] carStorage1 = new Car[3];


        //create object instances


//        car3.setRented(true);


        //store object instances in array list

// {
//            String carStatus;
//            if (!carStorage1[i].isRented()) {
//                carStatus = " available for you today";
//            }else{
//                carStatus ="  Sorry, you are not able to select this car today"
//;            }
//
////                System.out.println("(" + (i + 1) + ")" + carStorage1[i].getName()+ carStatus);
//            }

//        System.out.println();

//         UserInput.readInt( );
//

//        System.out.println();
        initializeCarStorage();
        mainMenu();

    }

        private static void  mainMenu(){
            System.out.println("\n\t\t Main Menu \n");
            System.out.println("1) Rent a car");
            System.out.println("2) Return a car \n");
            System.out.println("3) Exit Menu");
            int  userInputMenu= UserInput.readInt("Select An Option Today ", 1, 3);
            System.out.println("\n You decided to select " + userInputMenu);
            if(userInputMenu == 1){
                rentalMenu();
            }else if(userInputMenu == 2){
                returnACar();
            }else if(userInputMenu == 3){
                System.out.println("GoodBye!");

            }

        }
        private static void   rentalMenu(){
            System.out.println("Rental Menu");
            availableCars = carStorage.stream().filter(car -> !car.isRented()).collect(Collectors.toCollection(ArrayList::new));
            for (int i = 0; i < availableCars.size(); i++){
                String availableCarString = availableCars.get(i).getName();
                    System.out.println( (i+1) +")"+ availableCars.get(i).getName());
                    System.out.println(availableCarString + " available for you today");

            }
            int userSelection =UserInput.readInt("Enter the number of car you want to rent out today", 1,availableCars.size());
            System.out.println("You chose "+ availableCars.get(userSelection-1).getName());
            availableCars.get(userSelection-1).setRented(true);
            mainMenu();


        }

        private static void  returnACar(){
            System.out.println("Car Return");
            

            rentedCars = carStorage.stream().filter(car ->!car.isRented()).collect(Collectors.toCollection((ArrayList::new)));
            int userCarReturn = UserInput.readInt("What Car are you returning today?",1,rentedCars.size());
            System.out.println("You are returning " + rentedCars.get(userCarReturn-1).getName());
            rentedCars.get(userCarReturn-1).setRented(false);
            mainMenu();

        }
        private static void initializeCarStorage(){
           carStorage = new ArrayList<>();
            Car car1 = new Car("BMW", "3 series");
            Car car2 = new Car("Aston Martin", "Vantage");
            Car car3 = new Car("Porsche", "Taycan");
            carStorage.addAll(List.of(new Car[]{car1,car2,car3}));
//            carStorage[0] = car1;
//            carStorage[1] = car2;
//            carStorage[2] = car3;

//
        }
    }


