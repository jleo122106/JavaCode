/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraya;

/**
 *
 * @author John Leo D. Martinez
 */
import java.util.Arrays;

public class ArrayA {
    public static void main(String[] args) {

        int[] scores = {72, 85, 91, 76, 88, 94, 69, 83};

        int target = 88;
        boolean found = false;

        // Linear Search
        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println(target + " was not found.");
        }

        // Copy the array
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Sort the copy
        Arrays.sort(sortedScores);

        System.out.println("\nOriginal Array:");
        System.out.println(Arrays.toString(scores));

        System.out.println("\nSorted Copy:");
        System.out.println(Arrays.toString(sortedScores));

        /*
         * Sorting a copy keeps the original array unchanged.
         * This is useful if we still need the original order.
         */
    }
}