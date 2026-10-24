/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatypesandvariablese;

/**
 *
 * @author John Leo D. Martinez
 */
public class DatatypesandVariablesE {
    public static void main(String[] args) {

        // Variables
        int quan = 5;
        double uprice = 150.50;
        String sname = "LEO Store";

        // Calculate total cost
        double totalCost = quan * uprice;

        // totalCost should NOT be an int because the result may contain
        // decimal values, which would be lost if stored as an int.

        // Print itemized summary
        System.out.println("Store Name   : " + sname);
        System.out.println("Quantity     : " + quan);
        System.out.println("Unit Price   : PHP " + uprice);
        System.out.println("Total Cost   : PHP " + totalCost);
    }
}