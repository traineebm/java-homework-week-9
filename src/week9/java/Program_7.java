package week9.java;

import java.util.ArrayList;

// Write a Java program to test an array list is empty or not. Define array list with underground tube names
public class Program_7 {
    public static void main(String[] args) {
        tubeNames();
    }
    public static void tubeNames() {
        // Creating an array list
        ArrayList<String> t1 = new ArrayList<>();

        //Check if An ArrayList is empty
       // System.out.println(" Is the underground tubenames empty? : " + t1.isEmpty());
        t1.add("Bakerloo");
        t1.add("Jubilee");
        t1.add("Circle");
        t1.add("Hammersmith & City");
        t1.add("Northern Line");
        t1.add("Victoria Line");

        //Test whether the array is empty or not
        if (t1.isEmpty()) {
            System.out.println("The ArrayList is empty");
        } else {
            System.out.println("The ArrayList is not empty");
        }
    }
}