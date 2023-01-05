package org.example.NumberPattern;

public class Diamond {
    public static void main(String[] args) {
        String a = "a";
        int row = 5;
        for (int i=1;i<=row;i++){
            for (int j=row-1;j>=i;j--){

                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1;i<=row-1;i++){
            for (int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for (int k=row-1;k>=i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
