package org.example;

import java.io.*;

public class Serialization {
    public static void main(String[] args) throws IOException {
      SubEntity entity = new SubEntity();
      entity.setId(1);
      entity.setName("kunal");
      entity.setEmailid("kunal@gmail.com");
      entity.setLastname("dusane");
      entity.setPhoneno(2342342);
      entity.setAreaOfExpertise("java ");
      entity.setRating("5star");
        File file = new File("serial.ser");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

        System.out.println(entity);

        System.out.println("this is serialization ");
        oos.writeObject(entity);

    }
}