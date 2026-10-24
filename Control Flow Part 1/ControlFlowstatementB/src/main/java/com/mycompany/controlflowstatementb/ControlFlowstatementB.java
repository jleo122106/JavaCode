/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflowstatementb;

/**
 *
 * @author John Leo D. Martinez
 */
public class ControlFlowstatementB {
    public static void main(String[] args) {

        // Test 1
        int score = 75;

        System.out.println("Score: " + score);

        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }

        System.out.println();

        // Test 2
        score = 45;

        System.out.println("Score: " + score);

        if (score >= 60) {
            System.out.println("PASSED");
        } else {
            System.out.println("FAILED");
        }
    }
}