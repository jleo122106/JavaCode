/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflow2e;

/**
 *
 * @author John Leo D. Martinez
 */
import java.util.Scanner;

public class ControlFlow2E {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // 2D array, -1 means damaged shelf
        int[][] warehouse = {
            {10, -1, 5},
            {8, 2, 6}
        };

        int choice;

        do {
            System.out.println("\n1. Total Inventory");
            System.out.println("2. Find Low Shelf");
            System.out.println("3. Restock");
            System.out.println("0. Exit");
            System.out.print("Choice: ");

            choice = input.nextInt();

            if (choice == 1) {

                int total = 0;

                for (int row = 0; row < warehouse.length; row++) {
                    for (int col = 0; col < warehouse[row].length; col++) {

                        // continue = skip damaged shelf
                        if (warehouse[row][col] == -1) {
                            continue;
                        }

                        total += warehouse[row][col];
                    }
                }

                System.out.println("Total Inventory: " + total);
            }

            else if (choice == 2) {

                boolean found = false;

                for (int row = 0; row < warehouse.length; row++) {
                    for (int col = 0; col < warehouse[row].length; col++) {

                        // break = stop at first low shelf
                        if (warehouse[row][col] == 2) {
                            System.out.println("Low Shelf Found: " + warehouse[row][col]);
                            found = true;
                            break;
                        }
                    }

                    if (found) {
                        break;
                    }
                }
            }

            else if (choice == 3) {
                restock(input);
            }

        } while (choice != 0);

        System.out.println("Program Ended");
    }

    public static void restock(Scanner input) {

        int amount = 0;

        while (amount <= 0) {
            System.out.print("Enter amount: ");
            amount = input.nextInt();
        }

        System.out.println("Restocked!");

        return; // return requirement
    }
}