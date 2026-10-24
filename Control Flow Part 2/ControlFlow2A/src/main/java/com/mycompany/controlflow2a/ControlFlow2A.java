/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.controlflow2a;

/**
 *
 * @author John Leo D. Martinez
 */
public class ControlFlow2A {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int col = 1; col <= row; col++) {

                // CONTINUE: skip column 3
                if (col == 3) {
                    continue;
                }

                System.out.print("* ");
            }

            System.out.println();

            // BREAK: stop after row 4
            if (row == 4) {
                break;
            }
        }
    }
}