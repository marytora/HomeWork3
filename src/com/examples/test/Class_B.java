package com.examples.test;

import java.util.Scanner;

public class Class_B {
    public void input_of_class_B() {
        Scanner class_object2 = new Scanner(System.in);
        System.out.println("a is: ");
        int a = class_object2.nextInt();
        System.out.println("b is: ");
        int b = class_object2.nextInt();
        int Max_ab = Math.max(a, b);
        System.out.println("max of a & b is: " + Max_ab + "\n" + Math.min(a, b));
    }


}