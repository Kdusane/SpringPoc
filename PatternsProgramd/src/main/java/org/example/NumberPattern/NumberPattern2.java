package org.example.NumberPattern;

public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 4;
        int count = 1;
        for (int i=1;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(count++ +" ");

            }
            System.out.println();
        }

    }
}
