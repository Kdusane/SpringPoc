package org.example.NumberPattern;

public class NumberPattern1 {
    public static void main(String[] args) {
        int count =7;
        for (int i=0;i<=count;i++ ){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
/*
1
12
123
12234
*/