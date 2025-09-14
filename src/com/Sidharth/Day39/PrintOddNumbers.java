package com.Sidharth.Day39;

public class PrintOddNumbers {
    public static void main(String[] args) {
    System.out.println("Odd numbers between 1 and 30:");
    for (int i = 1; i <= 30; i++) {
        if (i % 2 != 0) {
            System.out.print(i + " ");
        }
    }
}
}
