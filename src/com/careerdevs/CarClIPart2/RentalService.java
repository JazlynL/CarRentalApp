package com.careerdevs.CarClIPart2;

import java.util.ArrayList;
import java.util.List;

public class RentalService {

    private static  ArrayList<Car> carStorage;
    private  static ArrayList <Car> availableCars;
    private static ArrayList<ArrayList<Car>> rentedCars;




    public static void main(String [] args){


       intializeCarStorage();
        mainMenu();



    }
    private static void mainMenu() {

//        int  availableC = UserInput;

//        if(availableC >= 0){
//            rentalMenu();
//            return;
//
//        }else if(availableC <= 0 )
////        {
//            System.out.println("nooo");
//        }
        System.out.println("Welcome to the car rental center");
        System.out.println(UserInput.lineSpacer() + "\n\t\t\tMain Menu\n" + UserInput.lineSpacer());
        System.out.println("1.) Rental menu");
        System.out.println("2.) Car Return");
        System.out.println("3.) Exit");
        int userInput = UserInput.readInt("What are you deciding to do today ?", 1, 3);
        System.out.println(userInput);
        if (userInput == 1) {
            rentalMenu();
        } else if (userInput == 2) {
            returnCar();
        } else if (userInput == 3) {
            System.out.println("Goodbye, :)");
        }
    }



    private static void rentalMenu() {
        System.out.println("\n\n Welcome to the Rental part of the program. \n\n");
        ArrayList <Car> availabilityCar = getAvailableCar();
        System.out.println("\n\nAvailable Cars");
        for (int i = 0; i < availabilityCar.size(); i++) {

                System.out.println(  "("+ (i+1)+")"+ availabilityCar.get(i).getName());
//                availableCars.add(carStorage.get(i));

        }

        int userSelect = UserInput.readInt("What Car do you want to rent out today?", 1,availabilityCar.size());
        System.out.println("You chose " + availabilityCar.get(userSelect - 1).getName());
        availabilityCar.get(userSelect - 1).setRentedCar(true);
        mainMenu();


    }

    private static ArrayList<Car> rentedCars(){
        ArrayList <Car> rentalCar = new ArrayList<>();
        for(int i = 0 ; i < carStorage.size(); i++){
            if(carStorage.get(i).isRentedCar()){
                rentalCar.add(carStorage.get(i));
            }
        }
        return rentalCar;
    }


    private static ArrayList<Car> getAvailableCar(){
        ArrayList  <Car> availableCar = new ArrayList<>();
        for (int i = 0 ; i < carStorage.size();i++){
            if(!carStorage.get(i).isRentedCar()){
                availableCar.add(carStorage.get(i));
            }
        }
        return availableCar;
    }
        private static void returnCar () {
          ArrayList <Car> returnedRent = rentedCars();
            System.out.println("\n Car return \n");
          for( int i = 0 ; i < returnedRent.size();i++){
              String tempRent = returnedRent.get(i).getName();
              System.out.println(  i+1+".)" + tempRent);

          }
          int userReturn = UserInput.readInt("What car are you trying to return ?", 1,returnedRent.size());
          Car selectedCar = returnedRent.get(userReturn-1);
          selectedCar.setRentedCar(false);
            System.out.println( "You are returning "+ selectedCar.getName() + "  Thanks :)");

             mainMenu();
//
//            rentedCars = new ArrayList<ArrayList<Car>>();
//            System.out.println("Welcome to the Return menu;");
//            for (int i = 0; i < carStorage.size(); i++) {
//                if (carStorage.get(i).isRentedCar()) {
////                    rentedCars.add(carStorage.get(i));
//                }
//
//            }
//            int userSelectCar = UserInput.readInt("What Car are you returning Today ?", 1, 3);
//            System.out.println("You brought back " + carStorage.get(userSelectCar - 1).getName());
//


//           rentedCars.get(userSelectCar-1).isRentedCar();


        }

    private static void intializeCarStorage(){
        carStorage = new ArrayList<>();
        Car car1 = new Car("Honda","Accord",false);
        Car car2 = new Car("Toyota","Camry",false);
        Car car3 = new Car("Jeep", "Rubicon",false);

        carStorage.addAll(List.of(new Car[]{car1,car2,car3}));


    }
}
