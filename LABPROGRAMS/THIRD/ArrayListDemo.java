package THIRD;

/**
 * Q3) A) Write a Java program to illustrate collection class Array List.
 */

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("Elements in ArrayList:" + cars);
        System.out.println("Element at 0th index: " + cars.get(0));
        cars.set(0, "Opel"); // changing element at 0th index
        System.out.println("\n0th index element after change: " + cars.get(0));
        cars.remove(0); // Removing an element at 0th index
        System.out.println("After removal of 0th index element from ArrayList:" + cars);
        System.out.println("The size of the ArrayList:" + cars.size());
        System.out.println("Using for loop parsing through ArrayList:");

        for (int i = 0; i < cars.size(); i++)
            System.out.println(cars.get(i));

        System.out.println("Using for : each loop to parse through ArrayList:");

        for (String i : cars)
            System.out.println(i);

        cars.clear(); // Clearing all elements in an ArrayList
        System.out.println("Elements in ArrayList after clear:" + cars);
    }
}

// Output:
// Elements in ArrayList:[Volvo, BMW, Ford, Mazda]
// Element at 0th index: Volvo
//
// 0th index element after change: Opel
// After removal of 0th index element from ArrayList:[BMW, Ford, Mazda]
// The size of the ArrayList:3
// Using for loop parsing through ArrayList:
// BMW
// Ford
// Mazda
// Using for : each loop to parse through ArrayList:
// BMW
// Ford
// Mazda
// Elements in ArrayList after clear:[]