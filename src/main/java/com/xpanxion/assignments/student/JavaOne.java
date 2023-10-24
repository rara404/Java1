package com.xpanxion.assignments.student;

import java.util.Scanner;

public class JavaOne {
    Scanner console = new Scanner(System.in);
    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {

        System.out.println("Please enter your name: ");
        String name = console.nextLine();
        name = name.toUpperCase();
        System.out.println("Your name i upper case is: " + name);
    }

    public void ex2() {
        System.out.println("Please enter the string: ");
        String input = console.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if(Character.isUpperCase(input.charAt(i))) count++;
        }
        System.out.println("Number of uppercase letters: " + count);
    }

    public void ex3() {
        System.out.println("Please enter the string: ");
        String input = console.nextLine();
        String[] tokenInput = input.split(" ");
        for (int i = 0; i < tokenInput.length; i++) {

            if(i%2 == 0) System.out.print(tokenInput[i].toUpperCase() + " ");
            else System.out.print(tokenInput[i].toLowerCase() + " ");
        }

    }

    public void ex4() {

        System.out.println("Please enter the string: ");
        String input = console.nextLine();
        input = input.toLowerCase();

        int n = input.length();
        for (int i = 0; i < (n/2); i++) {
            if (input.charAt(i) != input.charAt(n - i - 1)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");;
    }

    public void ex5() {


        String input;
        do {
            System.out.println("Please enter the string: ");
            input = console.nextLine();
            input = input.toLowerCase();
            if(input.equals("quit")) continue;
            int vowel = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
                        || input.charAt(i) == 'o' || input.charAt(i) == 'u') vowel++;
            }
            System.out.println("Number of vowels: " + vowel);
            System.out.println("Number of consonants: " + (input.length() - vowel));
        } while (input != "quit");
    }

    public void ex6() {
        System.out.println("Enter first number: ");
        int input1 = console.nextInt();

        System.out.println("Enter second number: ");
        int input2 = console.nextInt();

        System.out.println("Result: " + (input1+input2));
    }

    public void ex7() {
        System.out.println("Enter first number: ");
        int input1 = console.nextInt();

        System.out.println("Enter second number: ");
        int input2 = console.nextInt();

        System.out.println("Enter operation (add, sub, mul, div): ");
        String op = console.next();
        switch (op){
            case "add":
                System.out.println("Result: " + (input1+input2));
                break;

            case "sub":
                System.out.println("Result: " + (input1-input2));
                break;

            case "mul":
                System.out.println("Result: " + (input1*input2));
                break;

            case "div":
                if(input2 != 0)
                    System.out.println("Result: " + (input1/input2));
                else
                    System.out.println("The denominator is zero");

                break;
        }

    }

    public void ex8() {
        String input = "";

        System.out.println("Enter price per square feet: ");
        int price = console.nextInt();
        int totalCost = 0;
        int width, height;

        while(true){
            if(input.equalsIgnoreCase("done")) break;

            System.out.println("Enter room dimensions (width x height): ");
            input = console.next().toLowerCase();

            if(input.equalsIgnoreCase("done")) break;

            String[] inputArray = input.split("x");
            width = Integer.parseInt(inputArray[0]);
            height = Integer.parseInt(inputArray[1]);

            totalCost = totalCost + (width*height*price);
        }

        System.out.println("Total cost: " + totalCost);

    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
