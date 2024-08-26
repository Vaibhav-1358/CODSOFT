package codsoft2;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get student details
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        
        double[] Marks = new double[numberOfSubjects];
        double sum = 0;

        // Get grades for each subject
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            Marks[i] = scanner.nextDouble();
            sum += Marks[i];
        }

        // Calculate average grade
        double averageMarks = sum / numberOfSubjects;

        // Determine letter grade
        char letterGrade;
        if (averageMarks >= 90) {
            letterGrade = 'A';
        } else if (averageMarks >= 80) {
            letterGrade = 'B';
        } else if (averageMarks >= 70) {
            letterGrade = 'C';
        } else if (averageMarks >= 60) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        // Display results
        System.out.println("\nStudent Name: " + studentName);
        System.out.println("Marks: ");
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Subject " + (i + 1) + ": " + Marks[i]);
        }
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Letter Grade: " + letterGrade);

        scanner.close();
    }
}

