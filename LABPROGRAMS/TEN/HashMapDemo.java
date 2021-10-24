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
        HashMap hm = new HashMap();

        // Put elements to the map
        hm.put("Zara", new Double(3434.34));
        hm.put("Mahnaz", new Double(123.22));
        hm.put("Ayan", new Double(1378.00));
        hm.put("Daisy", new Double(99.22));
        hm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set set = hm.entrySet();

        // Get an iterator
        Iterator i = set.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        // Deposit 1000 into Zara's account
        double balance = ((Double) hm.get("Zara")).doubleValue();
        hm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + hm.get("Zara"));
    }
}

// Output:
// Daisy: 99.22
// Ayan: 1378.0
// Zara: 3434.34
// Qadir: -19.08
// Mahnaz: 123.22
// Zara's new balance: 4434.34