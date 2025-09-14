package com.Sidharth.Day37;

public class Alloperators {   public static void main(String[] args) {
    //  AssignmentOperators
    int a = 10;       // '=' assigns 10 to variable a
    int b = 5;        // '=' assigns 5 to variable b

    a += 3;           // a = a + 3 → 13
    b -= 2;           // b = b - 2 → 3
    a *= 2;           // a = a * 2 → 26
    b /= 3;           // b = b / 3 → 1
    a %= 5;           // a = a % 5 → 1

    System.out.println("After assignment operators: a = " + a + ", b = " + b);

    // Reset values for next operations
    a = 10;
    b = 5;

    //  RelationalOperators
    System.out.println("a == b: " + (a == b));   // Checks if a is equal to b → false
    System.out.println("a != b: " + (a != b));   // Checks if a is not equal to b → true
    System.out.println("a > b: " + (a > b));     // Checks if a is greater than b → true
    System.out.println("a < b: " + (a < b));     // Checks if a is less than b → false
    System.out.println("a >= b: " + (a >= b));   // Checks if a is greater or equal to b → true
    System.out.println("a <= b: " + (a <= b));   // Checks if a is less or equal to b → false

    //  LogicalOperators
    boolean x = true;
    boolean y = false;

    System.out.println("x && y: " + (x && y));   // Logical AND → false (both must be true)
    System.out.println("x || y: " + (x || y));   // Logical OR → true (one true is enough)
    System.out.println("!x: " + (!x));           // Logical NOT → false (negates true)

    //  TernaryOperator
    int number = -7;
    String result = (number >= 0) ? "Positive or Zero" : "Negative";
    // If number >= 0 "Positive or Zero"else "Negative"
    System.out.println("Number is: " + result);
}
}
