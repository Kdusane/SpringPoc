package com.dependancyInjection;

import java.lang.reflect.Array;

public class ABCD {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 20;

        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;


                }


            }
            System.out.println(arr[i]);
        }


    }
}
