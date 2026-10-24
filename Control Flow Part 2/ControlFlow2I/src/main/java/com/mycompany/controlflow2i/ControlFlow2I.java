/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflow2i;

/**
 *
 * @author John Leo D. Martinez
 */
import java.util.Scanner;

public class ControlFlow2I {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = 0;
        int total = 0;

        System.out.println("Enter numbers (-1 to stop):");

        while (number != -1) {

            number = input.nextInt();

            if (number != -1) {
                total = total + number;
            }
        }

        System.out.println("Final Total: " + total);

        input.close();
    }
}
