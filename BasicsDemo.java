

class Coffee {
  enum CoffeeSizes{SMALL, MEDIUM, LARGE}
  CoffeeSizes size;
}

public class CoffeeTest {
  public static void main (String arg[]) {
    Coffee drink = new Coffee();
    drink.size = Coffee.CoffeeSizes.SMALL;
    System.out.println("Size: " + drink.size)
  }
}

// Copy and paste your work, or start typing

//Car.java

import java.io.*;

public class Car {

  String model;
  int year;
  double gasMileage;

  //Constructor
  public Car(String model) {
    this.model = model;
  }

  //Assigning year
  public void carYear(int year) {
    year = carYear;
  }

  //Assigning mileage
  public void carGasMileage(int gasMileage) {
    gasMileage = carGasMileage;
  }

  //Printing out car info
  public void printCar() {
    System.out.println("Model:" + model);
    System.out.println("Year:" + year);
    System.out.println("Mileage:" + mileage);
  }
}

//Image this is a different file CarTest.java

import java.io.*;
public class CarTest {

  public static void main(String args[]) {
    //Creating car object with the constructor
    Car carOne = new Car("Mustang");
    Car carTwo = new Car("Jaguar");

    carOne.carYear(2017);
    carOne.carGasMileage(30);
    carOne.printCar();

    carTwo.carYear(2020);
    carTwo.carGasMileage(22);
    carTwo.printCar();


  }

}