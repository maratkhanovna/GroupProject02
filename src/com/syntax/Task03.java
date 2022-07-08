package com.syntax;

public class Task03 {
    /*
    Create a Class Vehicle that would have the following fields:
    vehiclePrice and method calculateSalePrice() which should be returning a price of the Vehicle.
    Create 2 sub classes: Sedan and Truck. The Truck class has field as weight
    and has its own implementation of  calculateSalePrice() method in which
    returned price calculated as following: if weight>2000 then returned price
    car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own
    implementation of calculateSalePrice(): if length of sedan is >20 feet
    then returned car price should include 5% discount, otherwise 10% discount
     */
    public static void main(String[] args) {
        Vehicle[] types = {new Sedan(20500, 14.5), new Truck(30870,6200)};
        for (Vehicle vehicles:types){
            System.out.println(vehicles.calculateSalePrice());
        }
    }
}
abstract class Vehicle{
    double vehiclePrice;

    public Vehicle(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    abstract double calculateSalePrice();
}
class Sedan extends Vehicle{
    double length;
    double salePrice;

    public Sedan(double vehiclePrice, double length) {
        super(vehiclePrice);
        this.length = length;
    }

    @Override
    double calculateSalePrice() {
        if (length>20){
            return salePrice=vehiclePrice-((vehiclePrice*5)/100);
        }else{
            return salePrice=vehiclePrice-((vehiclePrice*10)/100);
        }
    }
}
class Truck extends Vehicle{
    double weight;
    double salePrice;

    public Truck(double vehiclePrice, double weight) {
        super(vehiclePrice);
        this.weight = weight;
    }

    @Override
    double calculateSalePrice() {
        if (weight>2000){
            return salePrice=vehiclePrice-((vehiclePrice*10)/100);
        }else{
            return salePrice=vehiclePrice-((vehiclePrice*20)/100);
        }
    }
}
