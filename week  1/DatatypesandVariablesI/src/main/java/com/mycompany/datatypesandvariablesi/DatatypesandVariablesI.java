/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatypesandvariablesi;

/**
 *
 * @author John Leo D. Martinez
 */
public class DatatypesandVariablesI {
    public static void main(String[] args) {

        // Centimeters value
        double cmVal = 345.50;

        // Convert centimeters to whole meters
        int mVal = (int) cmVal / 100;

        // Remaining centimeters
        double remCm = cmVal - (mVal * 100);

        System.out.println("Centimeters: " + cmVal);
        System.out.println("Meters: " + mVal);
        System.out.println("Remaining Centimeters: " + remCm);

        // Implicit widening (int to double)
        int numVal = 25;
        double dNum = numVal; // No cast needed because double can store int values.

        System.out.println("\nImplicit Widening:");
        System.out.println("int value: " + numVal);
        System.out.println("double value: " + dNum);

        // Explicit narrowing (double to int)
        double scoreVal = 87.75;
        int wholeScore = (int) scoreVal; // The .75 decimal part is lost.

        System.out.println("\nExplicit Narrowing:");
        System.out.println("double value: " + scoreVal);
        System.out.println("int value: " + wholeScore);
    }
}