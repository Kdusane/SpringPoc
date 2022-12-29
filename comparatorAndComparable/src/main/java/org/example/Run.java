package org.example;

public class Run {
    Runnable r =()->{
       for (int i=10;i>1;i--){
           System.out.println("value is "+i);
           try {
               Thread.sleep(1000);
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
       }


    };
    public static void main(String[] args) throws InterruptedException {

        Run run = new Run();

        new Thread(run.r).start();
}}
