package org.example.StreamProblems;

import java.util.*;

public class Stream {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,32);
        //myList.stream().map(a->a+" ").filter(f->f.startsWith("1")).forEach(System.out::println); even number
    //     myList.stream().filter(a->a==a+1).forEach(System.out::println);  start with

//        Set<Integer> integerSet  = new HashSet<>();
//        myList.stream().filter(a->!integerSet.add(a)).forEach(System.out::println);  //identifying duplicate elements
//        myList.stream().findFirst().ifPresent(System.out::println); finding 1st element of list

//        long count = myList.stream().count();
//        System.out.println(count);  number of element in list

//      int  a = myList.stream().max(Integer::compare).get();
//        System.out.println(a); finding maximum element of list

//       String a = "1";
      //myList.stream().map(a->a+" ").filter(a->a.startsWith("1")).forEach(System.out::println);


//        for (int i=0;i<myList.size()-1;i++){
//            if (myList.get(i) ==myList.get(i+1)){
//                System.out.println(myList.get(i));
//            }
//
//
//        }

        myList.stream().sorted().sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }
}
