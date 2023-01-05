package org.example;

public class AmstrongNumber {
    static boolean isAmstrong(int n){
        int temp,digits=0,last=0,sum =0;
        temp = n ;
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            last = temp % 10;
            sum +=  (Math.pow(last, digits));
            temp = temp/10;
        }
        if(n==sum)

            return true;

        return false;
    }
    public static void main(String[] args) {
        if (isAmstrong(153)){
            System.out.println("is amstrong");
        }else {
            System.out.println("not an amstrong number ");
        }

    }
}
