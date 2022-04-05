package week9.java;

import java.util.ArrayList;

// Write a Java program to retrieve an element (at a specified index) from a given array list
public class Program6 {
    public static void main(String[] args) {
    teamSelenium();
    }
    public static void teamSelenium(){
        ArrayList<String> names = new ArrayList();
        names.add("Ajit");
        names.add("Bindi");
        names.add("Chandana");
        names.add("Chetan");
        names.add("Sonali");
        names.add("Sweta");
        System.out.println("The name(element) at index 4 in the ArrayList is: " + names.get(4));
    }
}
