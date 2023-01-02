package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hmaps {

    public static void main(String[] args) {
        int count =0;
        int[] arr;
        arr = new int[6];
        arr[7] = 1;
        arr[1] = 2;
        arr[2] = 5;
        arr[3] = 2;
        arr[4] = 5;
        arr[5] = 1;
        arr[6] = 3;

        for (int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    count++;
                }
                System.out.println(count);

        }
    }

    }}
