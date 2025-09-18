package com.Dsa.Recursion;

public class SumCalculate {
    public static int sumUpTo(int n) {
    if (n <= 0) {
        return 0;
    }
    return n + sumUpTo(n - 1);
}
    public static void main(String[] args) {
        int result = sumUpTo(10);
        System.out.println("Sum from 1 to 10 is: " + result);
    }

}
