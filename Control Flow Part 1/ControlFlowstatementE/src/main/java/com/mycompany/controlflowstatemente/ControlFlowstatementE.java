/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflowstatemente;

/**
 *
 * @author John Leo D. Martinez
 */
public class ControlFlowstatementE {
    public static void main(String[] args) {

        String username = "Leo";
        int pin = 1234;

        double balance = 8000;
        double withdrawal = 2000;

        String tier;
        double fee = 0;

        // Login check
        if (username.equals("Leo")) {

            if (pin == 1234) {

                // Account tier
                if (balance >= 10000) {
                    tier = "Gold";
                } else if (balance >= 5000) {
                    tier = "Silver";
                } else if (balance >= 1000) {
                    tier = "Bronze";
                } else {
                    tier = "Basic";
                }

                // Fee based on tier
                switch (tier) {
                    case "Gold":
                        fee = 50;
                        break;

                    case "Silver":
                        fee = 30;
                        break;

                    case "Bronze":
                        fee = 20;
                        break;

                    default:
                        fee = 10;
                }

                // Withdrawal check
                if (withdrawal <= balance) {
                    System.out.println("APPROVED");
                    System.out.println("Tier: " + tier);
                    System.out.println("Fee: " + fee);
                } else {
                    System.out.println("DENIED: Not enough balance.");
                }

            } else {
                System.out.println("DENIED: Wrong PIN.");
            }

        } else {
            System.out.println("DENIED: Wrong username.");
        }
    }
}
