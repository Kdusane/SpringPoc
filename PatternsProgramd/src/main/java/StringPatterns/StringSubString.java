package StringPatterns;

import java.util.*;

public class StringSubString {
    public static void main(String[] args) {
            String FIRSTNAME = "kunal";
            String LASTNAME = "Dusane";

            LASTNAME = LASTNAME + FIRSTNAME;

            FIRSTNAME = LASTNAME.substring(0,LASTNAME.length()-FIRSTNAME.length());
            LASTNAME = LASTNAME.substring(FIRSTNAME.length());

        System.out.println("LastName: "+LASTNAME);
        System.out.println("firstname: "+FIRSTNAME);
//        System.out.println(name.substring(1,2));


        List<String> stringList = new ArrayList<>();
        stringList.add("kunal");
        stringList.add("kunal");
        stringList.add("kunal");
        stringList.add("kunal");
        stringList.add("kunal");
        stringList.add("kunal");
        stringList.add("kunal");
        stringList.add("kunal");



        Set<String> strings = new HashSet<>(stringList);
        strings.stream().forEach(System.out::println);
    }
}
