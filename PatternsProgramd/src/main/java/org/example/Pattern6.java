package org.example;

public class Pattern6 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=4;j>=i;j--){
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x=1;x<=4;x++){
            for (int y=1;y<=x;y++){
                System.out.print(" ");
            }
            for (int z=4;z>=x;z--){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
