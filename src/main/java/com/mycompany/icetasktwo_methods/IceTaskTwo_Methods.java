/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetasktwo_methods;

import java.util.Scanner;

/**
 *
 * @author Mothekgeng Masemola
 */

public class IceTaskTwo_Methods {

    // Q1.1 - Returns sum of two numbers
    public static int calculateSum(int num1, int num2) {
        int total = num1 + num2;
        return total;
    }

    // Q1.4 - Returns average
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0;
        return average;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Q1.2 - Prompt user
        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        // Q1.3 - Call sum method
        int sum = calculateSum(firstNumber, secondNumber);
        System.out.println("Sum of the two numbers: " + sum);

        // Q1.4 - Call average method
        double average = calculateAverage(firstNumber, secondNumber);
        System.out.println("Average of the two numbers: " + average);

        input.close();
    }
}