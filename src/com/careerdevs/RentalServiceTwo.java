package com.careerdevs;

import java.util.ArrayList;

public class RentalServiceTwo {
    public static void main(String [] args){

        Car car1 = new Car("BMW", "3 series");
        Car car2 = new Car("Aston Martin", "Vantage");
        Car car3 = new Car("Porsche", "Taycan");

        ArrayList<Car> availableCars = new ArrayList<>();
        ArrayList<Car> rentedCars = new ArrayList<>();
        availableCars.add(car1);
        availableCars.add(car2);
        rentedCars.add(car3);

// with array list we use size instead of length
    System.out.println(availableCars);

    for (int i = 0 ; i < availableCars.size(); i++){

    }
    }


}
