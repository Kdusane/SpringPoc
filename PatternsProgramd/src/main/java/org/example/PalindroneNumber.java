package org.example;

public class PalindroneNumber {

    static boolean isPalindrone(int a){
        int temp=0,temp2=0;
        temp=a;
        if (temp>0){
            int remainder = temp%10;
            temp2 = temp2 *10+remainder;

        }else {
            return false;
        }
        return true;
    }
}
