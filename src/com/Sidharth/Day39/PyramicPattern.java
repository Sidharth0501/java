package com.Sidharth.Day39;
import java.util.Scanner;

public class PyramicPattern {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of rows (N): ");
    int N = scanner.nextInt();

    for (int i = 1; i <= N; i++) {
        for (int j = 1; j <= N - i; j++) {
            System.out.print(" ");}
        for (int k = 1; k <= (2 * i - 1); k++) {
            if (k % 2 == 0) {
                System.out.print(" ");
            } else {
                System.out.print("*");
            }
        }

        System.out.println();
    }

    scanner.close();
}


}
