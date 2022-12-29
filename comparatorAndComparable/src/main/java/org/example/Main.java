package org.example;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
interface A {
    static void q(){
        System.out.println("kunal");
    }
    public int a() throws IOException;
}
abstract class B implements A{
    @Override
    public int a() throws IOException {
        return 0;
    }
}
public class Main extends B {
    public static void main(String[] args) throws IOException {
      Main main = new Main();

      A.q();
      main.a();





        List<Students> studentsList = new ArrayList<>();
        studentsList.add(new Students(1, "kunal", 34324,23));
        studentsList.add(new Students(2, "kajal", 334000,20));
        studentsList.add(new Students(9, "lokesh", 34324,21));
        studentsList.add(new Students(4, "anchal", 34324,12));
        studentsList.add(new Students(5, "arif", 34324,10));
       // studentsList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//

        //Students maxage = studentsList.stream().max(Comparator.comparing(Students::getSalary));

        //Students maxvalue=studentsList.stream().max((m1,m2)->m1.getSalary()>m2.getSalary() ? 1:-1).get();
        //System.out.println(maxvalue.getId()+" "+maxvalue.getAge()+" "+maxvalue.getName());

//        Map<Integer, String> map = new HashMap<>();
//        map = studentsList.stream().collect(Collectors.toMap(Students::getId, Students::getName, (x,y)->x+""+y));
//
//        Set<Students> students = new TreeSet<>(studentsList);
//       // System.out.println(students);
       // studentsList.sort(Comparator.comparing(Students::getName));
//      //  System.out.println(studentsList);
//
//
//       // studentsList.stream().collect(Collectors.toSet()).forEach(System.out::println);
//
//        //now using lambda expression
//        //descending order
////        Collections.sort(l,new MyComparator());
////
////        System.out.println(l);
////        //ternary operator
//        studentsList.sort((e1, e2) -> (Integer.compare(e1.getId(), e2.getId())));
      // Collections.sort(studentsList,(e1,e2)->e1.getName().compareTo(e2.getName()));
//      studentsList.stream().sorted(new Comparator<Students>() {
//          @Override
//          public int compare(Students o1, Students o2) {
//              return Integer.compare(o1.getId(), o2.getId());
//          }
//      }).forEach(System.out::println);

//
//      HashMap<Integer, String > hashMap = new HashMap<>();
//        hashMap.put(1,"kunal");
//        hashMap.put(2,"kajal");
//        List<Integer> listofkeys = hashMap.keySet().stream().collect(Collectors.toList());
//        listofkeys.forEach(System.out::println);

//       studentsList.forEach(System.out::println);
////
//        Collections.sort(l,Comparator.comparing(Employee5::getId));
    }
}