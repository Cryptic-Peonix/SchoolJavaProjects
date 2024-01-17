//***************************************************
//
// Example file for Exception Processing Assignment
//
// Author: Kim Cannon
// Date: 5/14/15
//
//  Edited by: Connor Clark
//  Date: 1/16/24
//  2024SP_CPT-237-W34
//***************************************************

import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment_1_TryCatchExample {

    public static void main(String[] args) {

        // Create scanner and variables
        Scanner input = new Scanner(System.in);
        int in;
        double d;
        // try catch to handle divide by zero
        try {
            while (true) {
                // Get integer input and handle invalid input if found
                try {
                    System.out.print("Input integer value: ");
                    in = input.nextInt();
                    break;
                } catch (InputMismatchException ie) {
                    System.out.println("Invalid int detected! Please try again");
                    input.next();
                }

            }
            while (true) {
                // get double input and handle if invalid
                try {
                    System.out.print("Input double value: ");
                    d = input.nextDouble();
                    break;
                } catch (InputMismatchException ie) {
                    System.out.println("Invalid double detected! Please try again");
                    input.next();
                }
            }
            // divide inputs by zeroes to cause error
            int result1 = in / 0;
            double result2 = d / 0.0;
        }
        // handle divide by zero error and terminate program
        catch (ArithmeticException a) {
            System.out.println("Divide by zero detected! Terminating!");
        }

    }
}
