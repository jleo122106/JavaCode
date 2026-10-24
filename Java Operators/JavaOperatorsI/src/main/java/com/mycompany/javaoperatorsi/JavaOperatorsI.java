/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaoperatorsi;

/**
 *
 * @author John Leo D. Martinez
 */
public class JavaOperatorsI {
    public static void main(String[] args) {

        // Student grade
        int grade = 85;

        // Number of absences
        int absences = 2;

        // Check if student passed
        boolean passed = (grade >= 75 && absences <= 3) || (grade >= 90);

        System.out.println("Grade: " + grade);
        System.out.println("Absences: " + absences);

        if (passed) {
            System.out.println("PASS");
            System.out.println("Reason: The student passed the requirements.");
        } else {
            System.out.println("FAIL");
            System.out.println("Reason: The student did not meet the requirements.");
        }
    }
}