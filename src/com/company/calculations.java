package com.company;

import java.util.Scanner;

public class calculations {
    //............select car.......................................

    public static String carsName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your car number: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ERROR.........................");
            System.out.println("Enter Car Number as Integer!");
            return carsName();
        }
        int number = scanner.nextInt();
        if (number > 5 || number < 1) {
            System.out.println("ERROR.........................");
            System.out.println("HINT\nYou Entered invalid Number. Just Enter 1 To 5");
            return carsName();
        }
        String car;
        switch (number) {
            case 1:
                car = "BMW"; //factor 2
                break;
            case 2:
                car = "BENZ"; //factor 2
                break;
            case 3:
                car = "Chevrolet"; //factor 3
                break;
            case 4:
                car = "Bugatti"; //facto 5
                break;
            case 5:
                car = "Lamborghini"; //factor 10
                break;
            default:
                car ="Wrong, Inter 1 to 5";
        }
        return car;
    }

    public static double res(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your days: ");
        if (!scanner.hasNextInt()) {
            System.out.println("ERROR.........................");
            System.out.println("Enter Days as integer");
            return res(name);
        }
        int days = scanner.nextInt();
        if (days > 30 || days < 1) {
            System.out.println("ERROR.........................");
            System.out.println("HINT\nEnter 1 to 30 days");
            return res(name);
        }
        int factor = 0;
        switch (name) {
            case "BMW":
                factor = 2;
                break;
            case "BENZ":
                factor = 2;
                break;
            case "Chevrolet":
                factor = 3;
                break;
            case "Bugatti":
                factor = 5;
                break;
            case "Lamborghini":
                factor = 10;
                break;

        }
        double res = days * 1000 * factor;
        return res;
    }
}
