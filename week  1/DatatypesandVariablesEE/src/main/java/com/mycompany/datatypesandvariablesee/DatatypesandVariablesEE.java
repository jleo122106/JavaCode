/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.datatypesandvariablesee;

/**
 *
 * @author John Leo D. Martinez
 */
public class DatatypesandVariablesEE {
    public static void main(String[] args) {

        // ==========================
        // PART 1: BYTE OVERFLOW
        // ==========================

        byte number = 127; // Maximum value of a byte

        System.out.println("=== BYTE OVERFLOW ===");
        System.out.println("Before increment: " + number);

        number++; // Overflow happens here

        System.out.println("After increment: " + number);

        /*
         * A byte can only store values from -128 to 127.
         * When 127 is increased by 1, it wraps around to -128.
         * This is called overflow.
         */

        System.out.println();

        // ==========================
        // PART 2: STRING COMPARISON
        // ==========================

        String str1 = new String("Hello");
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("=== STRING COMPARISONS ===");

        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1.equals(str2) : " + str1.equals(str2));

        System.out.println("str1 == str3 : " + (str1 == str3));
        System.out.println("str1.equals(str3) : " + str1.equals(str3));

        System.out.println("str2 == str3 : " + (str2 == str3));
        System.out.println("str2.equals(str3) : " + str2.equals(str3));

        /*
         * str1 == str2 is FALSE because they are different objects.
         *
         * str1.equals(str2) is TRUE because the text inside them
         * is the same ("Hello").
         *
         * str1 == str3 is FALSE because str1 was created using
         * new String() while str3 is a string literal.
         *
         * str1.equals(str3) is TRUE because both contain "Hello".
         *
         * str2 == str3 is FALSE for the same reason.
         *
         * str2.equals(str3) is TRUE because both contain the
         * same text.
         */

        System.out.println();

        // ==========================
        // PART 3: SHARED ARRAY REFERENCE
        // ==========================

        int[] array1 = {10, 20, 30};

        int[] array2 = array1; // array2 shares array1's reference

        array2[0] = 99;

        System.out.println("=== SHARED ARRAY REFERENCE ===");
        System.out.println("array1[0] = " + array1[0]);
        System.out.println("array2[0] = " + array2[0]);

        /*
         * array1 and array2 point to the same array.
         * When array2[0] is changed to 99,
         * array1[0] also becomes 99.
         *
         * This shows reference sharing.
         */
    }
}