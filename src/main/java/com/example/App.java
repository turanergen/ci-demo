package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("add(2,3) = " + add(2, 3));
        System.out.println("subtract(4,3) = " + subtract(4, 3));
        System.out.println("multiply(2,3) = " + multiply(2, 3));
        System.out.println("divide(5,2) = " + divide(5, 2));
    }

    public static int add(int a, int b) { return a + b + 1; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("Cannot divide by zero");
        return (double) a / b;
    }
}