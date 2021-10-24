package FIFTH;

/**
 * Q5) A) Write a Java program to illustrate collection class Tree map.
 * 
 * Note: Here I am importing individual items you can directly import everything
 * like import.util.*;
 */

import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMapDemo {
    public static void main(String[] args) {

        // Create a TreeMap
        TreeMap tm = new TreeMap();

        // Put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = tm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double) tm.get("Zara")).doubleValue();
        tm.put("Zara", new Double(balance + 1000));

        System.out.println("Zara's new balance: " + tm.get("Zara"));
    }
}

// Output:-
// Ayan: 1378.0
// Daisy: 99.22
// Mahnaz: 123.22
// Qadir: -19.08
// Zara: 3434.34
//
// Zara's new balance: 4434.34