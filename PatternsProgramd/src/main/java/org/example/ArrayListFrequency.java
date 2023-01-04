package org.example;

import java.util.*;

public class ArrayListFrequency {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a","c","e","t","a","e","c");
        Set<String> stringSet = new HashSet<>(strings);
        for(String s1 : stringSet){
            System.out.println(s1+" "+Collections.frequency(strings,s1));
        }

    }
}
