/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraye;

/**
 *
 * @author John Leo D. Martinez
 */
public class ArrayE {

    static class Student {
        String name;
        int[] quizzes;

        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
        }

        double getAverage() {
            int sum = 0;

            for (int i = 0; i < quizzes.length; i++) {
                sum += quizzes[i];
            }

            return (double) sum / quizzes.length;
        }
    }

    public static void main(String[] args) {

        Student[] students = {
            new Student("John", new int[]{95, 90, 92, 93}),
            new Student("Leo", new int[]{90, 85, 88, 92}),
            new Student("Edziel", new int[]{80, 82, 85, 84}),
            new Student("Zhaldy", new int[]{90, 85, 88, 92})
        };

        String target = "Leo";

        // Linear Search
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equals(target)) {
                System.out.println(target + "'s Average: "
                        + students[i].getAverage());
                break;
            }
        }

        // Bubble Sort
        for (int i = 0; i < students.length - 1; i++) {

            for (int j = 0; j < students.length - 1 - i; j++) {

                if (students[j].getAverage()
                        < students[j + 1].getAverage()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("\n=== LEADERBOARD ===");

        int rank = 1;

        for (int i = 0; i < students.length; i++) {

            if (i > 0 &&
                students[i].getAverage()
                < students[i - 1].getAverage()) {

                rank = i + 1;
            }

            System.out.println(
                "Rank " + rank + " - "
                + students[i].name
                + " (Average: "
                + students[i].getAverage() + ")"
            );
        }
    }
}
