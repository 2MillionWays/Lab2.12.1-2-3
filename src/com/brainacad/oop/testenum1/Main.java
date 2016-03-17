package com.brainacad.oop.testenum1;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (MyDayOfWeek days : MyDayOfWeek.values()){
            System.out.println(days);
        }
        System.out.println("----------- Lab 2.12.2 -----------");
        for (MyDayOfWeek days : MyDayOfWeek.values()) {
            switch (days){
                case MONDAY:
                case WEDNESDAY:
                case FRIDAY:
                    System.out.println("My Java day: "+days);
            }
        }
        System.out.println("----------- Lab 2.12.3 -----------");
        System.out.print("Enter day: ");
        Scanner sc = new Scanner(System.in);
        String inputDay = sc.nextLine();
        System.out.println("Next Day will be: "+MyDayOfWeek.valueOf(inputDay).nextDay());

    }
}
