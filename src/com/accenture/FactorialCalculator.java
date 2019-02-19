package com.accenture;

//Count factorial:
//        f = N! = 1*2*3*...*N;
//
//        # Using for loop
//        # Using recursion
//
//        For each solution create separate method.
//        Enter results using console.

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Input number for factorial: ");
        int input = read.nextInt();
        System.out.println(factorial(input));
        System.out.println(recursiveFactorial(input));
    }

    private static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i; // factorial = factorial * i
        }
        return factorial;
    }

    private static int recursiveFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }
    }
}
