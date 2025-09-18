package com.Dsa.cache;
import java.util.*;

public class PageCache {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int count = 0;
        String[] cache = new String[n];

        for (int next = 0; next < n; next++) {
            System.out.print("Enter the string for element " + next + ": ");
            String data = sc.next();

            if (count < n) {
                for (int j = count; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = data;
                count++;
            } else {
                for (int j = n - 1; j > 0; j--) {
                    cache[j] = cache[j - 1];
                }
                cache[0] = data;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}