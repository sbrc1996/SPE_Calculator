package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Mini Calculator!!");
        do{
            System.out.println("Enter 1. For Addition!");
            System.out.println("Enter 2. For Subtraction!");
            System.out.println("Enter 3. For Multiply!");
            System.out.println("Enter 4. To Exit from the calculator!");
            System.out.println("Enter your choice:- ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            int first;
            int second;
            int result;
            switch(choice)
            {
                case 1:
                    System.out.println("Enter the first number");
                    first = sc.nextInt();
                    System.out.println("Enter the second number");
                    second = sc.nextInt();
                    result = first + second;
                    System.out.println("The answer for addition of "+first+" and "+second+" is "+result);
                    break;
                case 2:
                    System.out.println("Enter the first number");
                    first = sc.nextInt();
                    System.out.println("Enter the second number");
                    second = sc.nextInt();
                    result = first - second;
                    System.out.println("The answer for subtraction of "+first+" and "+second+" is "+result);
                    break;
                case 3:
                    System.out.println("Enter the first number");
                    first = sc.nextInt();
                    System.out.println("Enter the second number");
                    second = sc.nextInt();
                    result = first * second;
                    System.out.println("The answer for multiplication of "+first+" and "+second+" is "+result);
                    break;
                case 4:
                    System.out.println("Thanks for visiting, see you soon!!!");
                    System.exit(0);
                default:
                      System.out.println("Wrong Input, Try again!!");
            }
        }while(true);
    }
}