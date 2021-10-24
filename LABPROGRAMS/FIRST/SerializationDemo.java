package FIRST;

/**
 * Q1) B) Write a Java program to implement serialization concept.
 */

import java.io.*;

class Serialization implements java.io.Serializable {
    public int a;
    public String b;

    // Parameterized constructor
    public Serialization(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Serialization obj = new Serialization(1, "Java Programming");
        String fname = "file.txt";

        // Serialization
        try {
            // Saving of object in a file
            FileOutputStream fout = new FileOutputStream(fname);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            // Method for serialization of object
            out.writeObject(obj);

            out.close();
            fout.close();

            System.out.println("Object has been serialized");
        } catch (IOException ie) {
            System.out.println("IOException is caught");
        }
        Serialization serial = null;
        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream fin = new FileInputStream(fname);
            ObjectInputStream in = new ObjectInputStream(fin);

            // Method for deserialization of object
            serial = (Serialization) in.readObject();

            in.close();
            fin.close();

            System.out.println("Object has been deserialized ");
            System.out.println("a = " + serial.a);
            System.out.println("b = " + serial.b);
        } catch (IOException ie) {
            System.out.println("IOException is caught");
        } catch (ClassNotFoundException ce) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}

// Output:
// Object has been serialized
// Object has been deserialized
// a = 1
// b = Java Programming
