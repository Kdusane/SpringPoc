package org.example;

public class MainClass {
    public static void main(String[] args) {
        CarDetails carDetails = new CarDetails();
        Cars cars = carDetails.allcars("sport");
        cars.car();
    }
}
