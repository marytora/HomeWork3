package com.examples.test;

import java.util.Scanner;

public class Class_A {
    public void input_of_class_A(){
        Scanner class_Object1 = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = class_Object1.nextInt();
        System.out.println("Enter the value of b: ");
        int b = class_Object1.nextInt();
        int sum_ab = a + b;
        System.out.println("summer is (a+b)=" + sum_ab);
        System.out.println(a * b);
    }
}