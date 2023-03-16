package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args)
    {
        logger.info("\n Start of Logging...");
        logger.error("\n This is an test error message...");
        logger.fatal("\n This is an test fatal massage...");

        System.out.println("Welcome to Mini Calculator!!");

        Calculator cc = new Calculator();
        do{
            logger.debug("\n Control now in the main loop....");

            System.out.println("Enter 1. For Addition!");
            System.out.println("Enter 2. For Subtraction!");
            System.out.println("Enter 3. For Multiply!");
            System.out.println("Enter 4. To Exit from the calculator!");
            System.out.println("Enter your choice:- ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            int first;
            int second;
            switch(choice)
            {
                case 1:
                    logger.debug("\n Control with the addition function....");

                    System.out.println("Enter the first number");
                    first = sc.nextInt();
                    System.out.println("Enter the second number");
                    second = sc.nextInt();
                    System.out.println("The answer for addition of "+first+" and "+second+" is "+cc.add(first,second));
                    break;
                case 2:
                    logger.debug("\n Control with the Subtraction function....");

                    System.out.println("Enter the first number");
                    first = sc.nextInt();
                    System.out.println("Enter the second number");
                    second = sc.nextInt();
                    System.out.println("The answer for subtraction of "+first+" and "+second+" is "+cc.sub(first,second));
                    break;
                case 3:
                    logger.debug("\n Control with the Multiplication function....");

                    System.out.println("Enter the first number");
                    first = sc.nextInt();
                    System.out.println("Enter the second number");
                    second = sc.nextInt();
                    System.out.println("The answer for multiplication of "+first+" and "+second+" is "+cc.mul(first,second));
                    break;
                case 4:
                    logger.debug("\n See you later...");

                    System.out.println("Thanks for visiting, see you soon!!!");
                    System.exit(0);
                default:
                      logger.debug("\n Control with the default case....");

                      System.out.println("Wrong Input, Try again!!");
            }
        }while(true);

    }
}