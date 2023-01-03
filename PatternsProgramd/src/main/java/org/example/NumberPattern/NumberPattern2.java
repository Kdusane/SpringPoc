package org.example.NumberPattern;

public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 6;
        for (int i=0;i<=rows;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
