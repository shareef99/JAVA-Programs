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
        TreeMap<String, Double> tm = new TreeMap<String, Double>();

        // Put elements to the map
        tm.put("Zara", 3434.34);
        tm.put("Mahnaz", 123.22);
        tm.put("Ayan", 1378.00);
        tm.put("Daisy", 99.22);
        tm.put("Qadir", -19.08);

        // Get a set of the entries
        Set set = tm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }
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