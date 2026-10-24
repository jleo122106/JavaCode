/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayi;

/**
 *
 * @author John Leo D. Martinez
 */
public class ArrayI {
    public static void main(String[] args) {

        int[] scores = {72, 85, 91, 76, 88, 94, 69, 83};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];

        for (int i = 0; i < scores.length; i++) {

            sum = sum + scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        double average = sum / 8.0;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}
