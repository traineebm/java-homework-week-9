package week9.java;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
*/
public class Program5 {
    public static void main(String[] args) {
    listOfBags();
    }

    public static void listOfBags(){
        //Creating an arraylist for handbag brands
        ArrayList<String> handbags = new ArrayList();
        handbags.add("Michael Kors");
        handbags.add("Loius Vuitton");
        handbags.add("Coach");
        handbags.add("Furla");
        handbags.add("Long Champ");
        handbags.add("Tory Burch");
        handbags.add("Kate Spade");

        //Iteration using Iterator interface
        Iterator itr = handbags.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

