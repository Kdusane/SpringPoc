package org.example;

public class Pattern8 {
    public static void main(String[] args) {
        for (int i=0;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*"+" ");
            }
//            for (int l=5;l<=2;l++){
//                System.out.print("*");
//            }
            System.out.println();
        }
    }

}
