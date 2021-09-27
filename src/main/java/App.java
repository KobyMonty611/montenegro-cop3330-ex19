/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String output;
        Scanner scan = new Scanner(System.in);

        double height = 0;

        while(height == 0)
        {
            try
            {
                System.out.println("Please Enter your height in inches:");
                height = scan.nextDouble();
            }
            catch(Exception e)
            {
                System.out.println("That is not a number, please enter a number.");
            }
        }

        double weight = 0;

        while(weight == 0)
        {
            try
            {
                System.out.println("Please enter your weight in pounds:");
                weight = scan.nextDouble();
            }
            catch(Exception e)
            {
                System.out.println("That is not a number, please enter a number.");
            }
        }

        double BMI = (weight / (height * height)) * 703;

        if(BMI<18.5)
        {
            output = String.format("Your BMI is %.2f.\nYou are underweight. You should see your doctor.", BMI);
        }
        else if(BMI>25)
        {
            output = String.format("Your BMI is %.2f.\nYou are overweight. You should see your doctor.", BMI);
        }
        else
        {
            output = String.format("Your BMI is %.2f.\nYou are within the ideal weight range.", BMI);
        }

        System.out.println(output);

        scan.close();

    }
}