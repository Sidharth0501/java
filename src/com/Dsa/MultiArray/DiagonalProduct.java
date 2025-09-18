package com.Dsa.MultiArray;

public class DiagonalProduct {
    public static void main(String[] args) {
        int pro = 1;
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if (i==j){
                   pro*=arr[i][i];

                }
            }
        }
          for(int i = 0;i<arr.length;i++){
              arr[i][i]=pro;
        }
        System.out.println(pro);
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){

                    System.out.print(arr[i][j]+" ");
                }
            System.out.println();
            }
         }

    }
    
