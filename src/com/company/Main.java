package com.company;

import com.company.task1.IHelloWorld;
import com.company.task2.ClassHelloWorld;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        // TASK 1

        System.out.println("Task1\n");

        IHelloWorld task1perimeter = new IHelloWorld() {
            @Override
            public double perimeter(double a, double b) {
                return (a + b) * 2;
            }
        };

        System.out.println("Perimeter is " + task1perimeter.perimeter(8.5, 2.0));
        task1perimeter.printHelloWorld();

        // TASK 2
        System.out.println("\nTask2\n");

        try {
            ClassHelloWorld task2 = new ClassHelloWorld();

            Field field1 = task2.getClass().getDeclaredField("number");
            field1.setAccessible(true);
            field1.set(task2, 8);

            Field field2 = task2.getClass().getDeclaredField("word");
            field2.setAccessible(true);
            field2.set(task2, "Hello World!");

            System.out.println(field1.get(task2));
            System.out.println(field2.get(task2));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
