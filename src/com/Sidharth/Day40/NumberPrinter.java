package com.Sidharth.Day40;

public class NumberPrinter {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}
