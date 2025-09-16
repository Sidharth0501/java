package com.Dsa.Array;

public class ReplaceIndex {public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6};
    arr[2] = 99;
    System.out.println("Array after replacement:");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}

}
