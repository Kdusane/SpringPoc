package org.example;

public class Pattern10 {
    public static void main(String[] args) {
        int counter=1;
        for(int i=1;i<=5;i++) {
//			System.out.print(" ");
            for(int j=1;j<=i;j++) {
//				System.out.print("*"+" ");
                System.out.print(counter+" ");
                counter++;;
            }
            System.out.println();

        }
    }
}
