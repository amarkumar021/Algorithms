package com.amar.learn;

import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = scanner.nextInt();
        System.out.println("Factorial of: " + num + " is " + factorial(num));
    }

    private static int factorial(int num) {
        if (num == 1)
            return 1;
        else
            return ( num * factorial(num - 1));
    }


}
