package com.xpanxion.assignments.student;

import java.text.NumberFormat;
import java.util.*;

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

        Map<Integer, Person> hashPer = new HashMap<>();

        Person person1 = new Person("Peter", "Jones", 1);
        Person person2 = new Person("John", "Smith", 2);
        Person person3 = new Person("Mary", "Jane", 3);

        hashPer.put(person1.getId(), person1);
        hashPer.put(person2.getId(), person2);
        hashPer.put(person3.getId(), person3);

        while(true){

            System.out.print("Enter Person ID: ");
            String input = console.next();

            if(input.equalsIgnoreCase("done")) break;
            int id = Integer.parseInt(input);

            if(hashPer.containsKey(id)){
                System.out.println(hashPer.get(id));
            } else{
                System.out.println("The ID is not associated with any Person");
            }
        }
    }

    public void ex3() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }


    public void ex4() {
        var invoice =  new Invoice(1);
        invoice.addProduct(new Product(111,"Mustard", 2.00));
        invoice.addProduct(new Product(222,"Ketchup", 3.00));
        invoice.addProduct(new Product(333,"Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));


    }
}
