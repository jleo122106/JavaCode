/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoperatorsa;

/**
 *
 * @author John Leo D. Martinez
 */
public class JavaOperatorsA {
    public static void main(String[] args) {

        // Starting balance
        double balance = 250.0;

        System.out.println("Starting Balance: " + balance);

        // Add money
        balance += 75;
        System.out.println("After += 75: " + balance);

        // Triple the balance
        balance *= 3;
        System.out.println("After *= 3: " + balance);

        // Add more money
        balance += 40;
        System.out.println("After += 40: " + balance);

        System.out.println();

        // Postfix increment
        int count = 8;

        System.out.println("count++ = " + (count++));
        System.out.println("count after count++ = " + count);

        System.out.println();

        // Prefix increment
        int count2 = 8;

        System.out.println("++count2 = " + (++count2));
        System.out.println("count2 after ++count2 = " + count2);

        /*
         * count++ uses the value first,
         * then adds 1.
         *
         * ++count adds 1 first,
         * then uses the value.
         *
         * That is why the answers are different.
         */
    }
}