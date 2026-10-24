/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoperatorsb;

/**
 *
 * @author John Leo D. Martinez
 */
public class JavaOperatorsB {
    public static void main(String[] args) {

        // Declare two integers
        int num1 = 20;
        int num2 = 5;

        // Perform arithmetic operations
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println();

        System.out.println("Addition (+): " + (num1 + num2));
        System.out.println("Subtraction (-): " + (num1 - num2));
        System.out.println("Multiplication (*): " + (num1 * num2));
        System.out.println("Division (/): " + (num1 / num2));
        System.out.println("Modulus (%): " + (num1 % num2));

        /*
         * The modulus (%) operator may behave differently
         * with negative numbers because the result keeps
         * the sign of the first number (dividend).
         */
    }
}   