package com.Dsa.MultiArray;

public class SumOfColumn {
    public static void main(String[] args) {
    int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    for (int i=0; i<4; i++) {
        int sum = 0;
        for (int row = 0; row < 4; row++) {
            sum += arr[row][i];
        }
        System.out.println("Sum of column "+ (i+1)+": " + sum);
    }
}

}
