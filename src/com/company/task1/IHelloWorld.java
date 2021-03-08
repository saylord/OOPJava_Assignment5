package com.company.task1;

public interface IHelloWorld {
    default void printHelloWorld() {
        System.out.println("Hello World! It is default method in interface.");
    }

    public double perimeter(double a, double b);
}
