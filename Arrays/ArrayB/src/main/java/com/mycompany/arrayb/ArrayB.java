/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrayb;

/**
 *
 * @author John Leo D. Martinez
 */
public class ArrayB {
    public static void main(String[] args) {

        // My favorite things
        String[] favorites = {
            "Motorcycle",
            "Iced Coffee",
            "Coding",
            "Dogs",
            "Basketball"
        };

        // Display the favorites
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        // Display total number of favorites
        System.out.println("\nArray Length: " + favorites.length);
    }
}
