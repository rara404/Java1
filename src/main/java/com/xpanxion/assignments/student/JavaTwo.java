package com.xpanxion.assignments.student;

import java.text.NumberFormat;
import java.util.*;

public class JavaTwo {

    Scanner console = new Scanner(System.in);

    public JavaTwo() {
    }


    public void ex1() {

        ArrayList<Person> arrayList = new ArrayList<>();

        while (true) {
            System.out.println("Enter Person: ");
            String input = console.nextLine();

            if (input.equalsIgnoreCase("done")) break;

            int id = input.charAt(0) - 48;
            input = input.substring(3);
            String[] arr = input.split(" ");
            String firstname = arr[0];
            String lastname = arr[1];

            arrayList.add(new Person(firstname, lastname, id));
        }

        for (int i = 0; i < arrayList.size(); i++) {
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

        while (true) {

            System.out.print("Enter Person ID: ");
            String input = console.next();

            if (input.equalsIgnoreCase("done")) break;
            int id = Integer.parseInt(input);

            if (hashPer.containsKey(id)) {
                System.out.println(hashPer.get(id));
            } else {
                System.out.println("The ID is not associated with any Person");
            }
        }
    }

    public void ex3() {
        var invoice = new Invoice(1);
        invoice.addProduct(new Product(111, "Mustard", 2.00));
        invoice.addProduct(new Product(222, "Ketchup", 3.00));
        invoice.addProduct(new Product(333, "Franks Hot Sauce", 4.00));
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Total cost: " + formatter.format(invoice.getTotalCost()));
    }


    public void ex4() {
        ex2();

    }

    public void ex5() {
        var repository = new Repository();
        var p = repository.getPerson();
        System.out.println(p);

    }

    public void ex6() {

        while (true) {

            System.out.println("Enter first number: ");
            String input = console.next();

            if (input.equalsIgnoreCase("done")) break;

            int input1 = Integer.parseInt(input);

            System.out.println("Enter second number: ");
            int input2 = console.nextInt();

            System.out.println("Enter operation (add, sub, mul, div): ");
            String op = console.next();
            switch (op) {
                case "add":
                    Calculator.add(input1, input2);
                    break;

                case "sub":
                    Calculator.sub(input1, input2);
                    break;

                case "mul":
                    Calculator.mul(input1, input2);
                    break;

                case "div":
                    Calculator.div(input1, input2);
                    break;
            }

        }

        for (int i = 0; i < Calculator.history.size(); i++) {
            System.out.println(Calculator.history.get(i));
        }

    }

    public void ex7() {
        var personList = Arrays.asList(
                new Person("Peter", "Jones", 1),
                new Person("John", "Smith", 2),
                new Person("Sue", "Anderson", 3)
        );


        personList.stream().map(person -> new Person(person.getFirstName(), "xxx", person.getId())).forEach(System.out::println);
    }


    public void ex8() {
        var personList = Arrays.asList(
                new Person("Charlie", "Jones", 1),
                new Person("Zoey", "Smith", 2),
                new Person("Adam", "Anderson", 3)
        );

        Collections.sort(personList);

        for (Person p : personList) {
            System.out.println(p);
        }


    }

    public void ex9() {
        var personList = Arrays.asList(
                new Person("Charlie", "Jones", 1),
                new Person("Zoey", "Smith", 2),
                new Person("Adam", "Anderson", 3)
        );

        var filteredList = new ArrayList<Person>();
        for (Person p : personList) {
            if (p.getLastName().equals("Smith")) filteredList.add(p);
        }
        for (Person p : filteredList) {
            System.out.println(p);
        }

    }

    public void ex10() throws InterruptedException {

        Queue q = new Queue();
        q.enqueue(new Cat("Alice"));
        q.enqueue(new Cat("Bob"));
        q.enqueue(new Cat("Charlie"));
        q.enqueue(new Cat("Dan"));


        while (!q.isEmpty()) {
            q.printQueue();
            q.dequeue();
            Thread.sleep(3000);
        }
    }
}

