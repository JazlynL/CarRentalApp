package com.careerdevs.CarClIPart2;

public class Car {
    private String make;
    private String model;
    private boolean rentedCar;

    public Car (String make, String model, boolean rentedCar){
        this.make = make;
        this.model = model;
        this.rentedCar = rentedCar;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getName(){
        return make+" "+model;
    }


    public boolean isRentedCar() {
        return rentedCar;
    }
    public void setRentedCar( boolean rented){
        rentedCar = rented;

    }
}
