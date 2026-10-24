/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoperatorse;

/**
 *
 * @author John Leo D. Martinez
 */
public class JavaOperatorsE {
    public static void main(String[] args) {

        int a = 6;
        int b = 3;
        int c = 2;

        // Prediction: true
        System.out.println("Prediction 1: true");
        System.out.println("Actual 1: " + (a + b > c * 4));

        // Prediction: false
        System.out.println("\nPrediction 2: false");
        System.out.println("Actual 2: " + ((a - b == c) && (b > 5)));

        // Prediction: true
        System.out.println("\nPrediction 3: true");
        System.out.println("Actual 3: " + ((++a > b) || (c > 10)));

        /*
         * ++a adds 1 before checking the condition.
         * That is why a becomes 7 first.
         */

        // Prediction: false
        System.out.println("\nPrediction 4: false");
        System.out.println("Actual 4: " + ((a % c == 0) && (b < 2)));

        /*
         * I predicted false because
         * b < 2 is false.
         */
    }
}