package com.Dsa.MultiArray;

public class FirstLastRow {
    public static void main(String[] args) {
    int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    int rows = arr.length;
    System.out.print("First row: ");
    for (int val : arr[0]) {
        System.out.print(val + " ");
    }
    System.out.println();
    System.out.print("Last row: ");
    for (int val : arr[rows - 1]) {
        System.out.print(val + " ");
    }
    System.out.println();
}

}
