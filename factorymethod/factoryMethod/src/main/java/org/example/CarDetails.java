package org.example;

public class CarDetails {
    public Cars allcars(String carname){
        if (carname.isEmpty()) return null;
        switch (carname){
            case "sport": return  new SportCar();
            case "suv" : return new SuvCar();
            case "sedan": return new SedanCar();
            default: throw new IllegalArgumentException("kuch bhi maat dal bhai");
        }

    }

    }


