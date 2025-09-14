package com.Sidharth.Day38;
import java.util.Scanner;

public class SwitchCaseAndIFElse {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your marks (0–100): ");
    int marks = scanner.nextInt();

    //if-else
    String grade;
    if (marks >= 90 && marks <= 100) {
        grade = "A";
    } else if (marks >= 80) {
        grade = "B";
    } else if (marks >= 70) {
        grade = "C";
    } else if (marks >= 60) {
        grade = "D";
    } else if (marks >= 0) {
        grade = "F";
    } else {
        System.out.println("Invalid marks entered.");
        return;}
     System.out.println("Your grade is: " + grade);

    // switch Case
    switch (grade) {
        case "A":
            System.out.println("Excellent performance!");
            break;
        case "B":
            System.out.println("Very good! Keep it up.");
            break;
        case "C":
            System.out.println("Good effort. You can do even better.");
            break;
        case "D":
            System.out.println("Needs improvement. Stay focused.");
            break;
        case "F":
            System.out.println("Failing grade. Work harder next time.");
            break;
        default:
            System.out.println("Unexpected grade.");
            break;
    }

    scanner.close();
}

}
