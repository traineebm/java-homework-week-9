package week9.java;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (String) and print out the collection
 * using for each loop.
 */
public class ColoursArray {
    public static void main(String[] args) {
        vibgyor();
    }

    String c[] = new String[6];
    public static void vibgyor(){
        //Declaring ArrayList of colours
        ArrayList<String> col = new ArrayList();
        col.add("Violet");
        col.add("Indigo");
        col.add("Blue");
        col.add("Green");
        col.add("Yellow");
        col.add("Orange");
        col.add("Red");

        for (String name:col) {
            System.out.println(name);
        }
    }
}
