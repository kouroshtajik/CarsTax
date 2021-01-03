package com.company;

import java.util.Scanner;

public class Main extends calculations{

    public static void main(String[] args) {
        print();
    }

    public static void print() {

        String carName = carsName(); //Get car number from user
        double res = res(carName);  //Get days from user
        System.out.println("Your car is " + carName + " and your Tax Equals to: " + res);
    }
}
