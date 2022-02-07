package com.revature.Week2;

import java.util.Scanner;

public class CalcHWK {
    public static void main(String[] args) {
        Scanner first = new Scanner(System.in);
        System.out.println("Enter First number:");
        double Fnumber = first.nextDouble();
        System.out.println("Enter Second number:");
        double Snumber = first.nextDouble();
        System.out.println("Select option \n 1-add \n 2-subtract \n 3-multiply \n 4-divide");
        int option = first.nextInt();
        switch (option){
            case 1:
                System.out.println("You chose addition after adding them your result is: " + add(Fnumber,Snumber));
                break;
            case 2:
                System.out.println("You chose subtraction after subtracting them your result is: " + sub(Fnumber,Snumber));
                break;
            case 3:
                System.out.println("You chose multiplication after multiplying them your result is: " + multiply(Fnumber,Snumber));
                break;
            case 4:
                System.out.println("You chose division after dividing them your result is: " + divide(Fnumber,Snumber));
            default:
                if(option > 5 || option < 1)
                System.out.println("Not a valid number , make sure to select from the menu in front of you");
        }

    }



    public static double add(double first, double second)
    {
        double result = first + second;
        return result;
    }

    public static double sub(double first, double second)
    {
        double result = first - second;
        return result;
    }
    public static double multiply(double first, double second)
    {
        double result = first * second;
        return result;
    }
    public static double divide(double first, double second)
    {
        double result = first/second;
        return result;
    }
}
