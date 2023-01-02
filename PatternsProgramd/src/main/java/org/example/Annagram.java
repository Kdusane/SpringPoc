package org.example;

import java.util.Arrays;

public class Annagram{
    public static void main(String[] args) {
        String a = "abba";
        String b = "kunal";

        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(arr1);
        System.out.println(arr2);
        boolean result = Arrays.equals(arr1,arr2); // to compare arrays

        if (result){
            System.out.println("is annagram");
        }else {
            System.out.println("not an anngram");
        }

}}
