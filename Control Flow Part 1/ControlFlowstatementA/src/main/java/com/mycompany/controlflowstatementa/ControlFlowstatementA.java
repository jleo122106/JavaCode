/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflowstatementa;

/**
 *
 * @author John Leo D. Martinez
 */ 
public class ControlFlowstatementA {

    public static void main(String[] args) {

        String userID = "SkyWalker";
        String passCode = "BlueMoon99";
        boolean accessBlocked = false;

        if (userID.equals("SkyWalker")) {

            if (passCode.equals("BlueMoon99")) {

                if (accessBlocked == false) {
                    System.out.println("Access Granted!");
                } else {
                    System.out.println("Access Denied: Account is blocked.");
                }

            } else {
                System.out.println("Access Denied: Incorrect password.");
            }

        } else {
            System.out.println("Access Denied: User ID not found.");
        }

        System.out.println("\n--- Failure Tests ---");

        System.out.println("Wrong Username");
        userID = "WrongUser";

        if (!userID.equals("SkyWalker")) {
            System.out.println("Access Denied: User ID not found.");
        }

        System.out.println("\nWrong Password");
        passCode = "WrongPass";

        if (!passCode.equals("BlueMoon99")) {
            System.out.println("Access Denied: Incorrect password.");
        }

        System.out.println("\nBlocked Account");
        accessBlocked = true;

        if (accessBlocked) {
            System.out.println("Access Denied: Account is blocked.");
        }
    }
}