/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */
import java.util.Scanner;   //Use class scanner

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Scanner to obtain input

        System.out.println("Press C to convert from Fahrenheit to Celsius.\nPress F to convert from Celsius to Fahrenheit.");
        System.out.println("Your choice: ");
        String choice = input.nextLine();   //obtain input from the user
        //Using if-else statement
        if (choice.equalsIgnoreCase("C")) { //if user chooses C
            System.out.println("Please enter the temperature in Fahrenheit: ");
            String temp = input.nextLine(); //obtain input from the user
            double F = Double.parseDouble(temp);    //Convert from string to double
            double celsius = (F - 32) * (5 / 9);    //Formula to convert the temp. from F to C
            System.out.printf("The temperature in Celsius is %.0f.", celsius);
        } else if (choice.equalsIgnoreCase("F")) {  //if user chooses F
            System.out.println("Please enter the temperature in Celsius: ");
            String temp = input.nextLine(); //obtain input from the user
            double C = Double.parseDouble(temp);    //Convert from String to double
            double fahrenheit = (C * 9 / 5) + 32;   //Formula to convert temp. from C to F
            System.out.printf("The temperature in Fahrenheit is %.0f. ", fahrenheit);
        } else {    //if user chooses neither C or F
            System.out.println("Invalid input. Please choose only C or F.");
        }
    }
}

