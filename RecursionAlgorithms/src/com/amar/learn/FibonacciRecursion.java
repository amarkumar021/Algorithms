package com.amar.learn;

import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int f = fibonacci(n);
        System.out.println(f);
    }

    private static int fibonacci(int n) {
        if (n < 1)
            return -1;
        else if (n == 1 || n == 2)
            return (n - 1);
        else
            return fibonacci( n -1 ) + fibonacci( n - 2);
    }
}
