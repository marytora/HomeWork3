package com.examples.test;

import java.util.Scanner;

public class Class_C {
    public void input_of_class_C() {
        Scanner /* Alt+ Enter*/ class_object3 = new Scanner(System.in);
        System.out.print("a: ");
        int a = class_object3.nextInt();
        System.out.print("b: ");
        int b = class_object3.nextInt();
        System.out.print("c: ");
        int c = class_object3.nextInt();
        int a_last_digit = a % 10;System.out.println("a's last digit is " + a_last_digit);

        int b_first_digit;
        for(b_first_digit = b; b_first_digit >= 10; b_first_digit /= 10) {
            System.out.println("first digit of b is: " + b_first_digit);
        }


        int sum = 0;

        for(int num = c; num > 0; num /= 10) {
            int digit = num % 10;
            sum += digit;
        }

        System.out.print("sum of digits in c is: " + sum);
        int a_a_last_digit = a * a_last_digit;
        int b_a_last_digit = b * a_last_digit;
        int c_a_last_digit = c * a_last_digit;
        System.out.print("\n" + a_a_last_digit + " ");
        System.out.print(b_a_last_digit);
        System.out.print(" " + c_a_last_digit + "\n");
        int a_a_last_digit_plus_b_first_digit = a_a_last_digit + b_first_digit;
        System.out.println(a_a_last_digit_plus_b_first_digit);
        int b_a_last_digit_plus_b_first_digit = b_a_last_digit + b_first_digit;
        System.out.println(b_a_last_digit_plus_b_first_digit);
        int c_a_last_digit_plus_b_first_digit = c_a_last_digit + b_first_digit;
        System.out.println(c_a_last_digit_plus_b_first_digit);
        System.out.println(b);
    }
}
