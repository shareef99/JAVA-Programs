package TEN;

/**
 * Q10) A) Write a Java program to illustrate collection class Hash map.
 * 
 * Note: Here I am importing individual items you can directly import everything
 * like import.util.*;
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a hash map
        HashMap<String, Double> hm = new HashMap<String, Double>();

        // Put elements to the map
        hm.put("Zara", 3434.34);
        hm.put("Mahnaz", 123.22);
        hm.put("Ayan", 1378.00);
        hm.put("Daisy", 99.22);
        hm.put("Qadir", -19.08);

        // Get a set of the entries
        Set set = hm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": " + me.getValue());
        }
    }
}

// Output:
// Daisy: 99.22
// Ayan: 1378.0
// Zara: 3434.34
// Qadir: -19.08
// Mahnaz: 123.22