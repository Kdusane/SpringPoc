package org.example;

import java.util.*;

public class CollectionsFrequencyExample2 {
    public static void main(String[] args) {
        //Create a list object
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("List of elements: "+list);
        System.out.println("Count all with frequency:");
        Set<Integer> uniqueSet = new HashSet<Integer>(list);
        for (Integer i : uniqueSet) {
            System.out.println(i + ": " + Collections.frequency(list, i));
        }
    }
}