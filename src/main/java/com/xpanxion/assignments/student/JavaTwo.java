package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaTwo {

    Scanner console = new Scanner(System.in);

    public JavaTwo() {}


    public void ex1() {

        ArrayList<Person> arrayList = new ArrayList<>();

        while(true){
            System.out.println("Enter Person: ");
            String input = console.nextLine();

            if(input.equalsIgnoreCase("done")) break;

            int id = input.charAt(0) - 48;
            input = input.substring(3);
            String[] arr = input.split(" ");
            String firstname = arr[0];
            String lastname = arr[1];

            arrayList.add(new Person(firstname, lastname, id));
        }

        for(int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }

    public void ex2() {

    }
}
