package FIFTH;

/**
 * Q5) B) Write a Java program that reads a file name from the user, and then displays information
 * about whether the file exists, whether the file is readable, whether the file is writable, the
 * type of file and the length of the file in bytes. 
 */

import java.io.File;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();

        File f1 = new File(s);

        System.out.println("File Name:" + f1.getName());
        System.out.println("Path:" + f1.getPath());
        System.out.println("Abs Path:" + f1.getAbsolutePath());
        System.out.println("Parent:" + f1.getParent());
        System.out.println("This file is:" + (f1.exists() ? "Exists" : "Does not exists"));
        System.out.println("Is file:" + f1.isFile());
        System.out.println("Is Directory:" + f1.isDirectory());
        System.out.println("Is Readable:" + f1.canRead());
        System.out.println("IS Writable:" + f1.canWrite());
        System.out.println("Is Absolute:" + f1.isAbsolute());
        System.out.println("File Last Modified:" + f1.lastModified());
        System.out.println("File Size:" + f1.length() + "bytes");
        System.out.println("Is Hidden:" + f1.isHidden());

        input.close();
    }
}

// Output:
// test.txt
// File Name:test.txt
// Abs Path:C:\JAVA\test.txt
// Path:test.txt
// Parent:null
// This file is:Exists
// Is file:true
// Is Directory:false
// Is Readable:true
// IS Writable:true
// Is Absolute:false
// File Last Modified:1635074836266
// File Size:20bytes
// Is Hidden:false