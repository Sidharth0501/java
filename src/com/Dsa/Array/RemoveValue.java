package com.Dsa.Array;
import java.util.ArrayList;

public class RemoveValue {public static void main(String[] args) {
    int[] original = {1, 2, 3, 2, 4, 2, 5};
    int valueToRemove = 2;

    ArrayList<Integer> resultList = new ArrayList<>();
    for (int num : original) {
        if (num != valueToRemove) {
            resultList.add(num);
        }
    }
    System.out.println("Array after removing " + valueToRemove + ":");
    for (int num : resultList) {
        System.out.print(num + " ");
    }
}

}
