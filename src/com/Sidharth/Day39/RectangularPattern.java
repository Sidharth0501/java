package com.Sidharth.Day39;
import java.util.Scanner;


public class RectangularPattern {  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of rows: ");
    int rows = scanner.nextInt();

    System.out.print("Enter number of columns: ");
    int columns = scanner.nextInt();

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= columns; j++) {

            if (j == columns) {
                System.out.print("*");
            } else {
                System.out.print("* ");
            }
        }
        System.out.println();
    }

    scanner.close();
}


}
