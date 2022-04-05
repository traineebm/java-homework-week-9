package week9.java;

import java.util.HashMap;
import java.util.Map;

/*
 *Create a HashMap object called people that will store
 *String keys and Integer values: And use for each loop to iterate the value from Map.
 */
public class HashMap_9 {
    public static void main(String[] args) {
        human();
    }
    public static void human(){
       // Declaring Map
        Map <String,Integer> people = new HashMap<>();

        //Adding keys and values - (Name, age)
        people.put("Bob",17);
        people.put("Charlie",18);
        people.put("James",19);
        people.put("Mary",20);
        people.put("Ryan",21);

        // Iteration via for each loop
      //  for (String i :people.keySet()) {
       //     System.out.println("key: " + i + ", value: " + people.get(i));

        for (Map.Entry<String,Integer> name:people.entrySet()){
        System.out.println(name.getKey()+ " , " + name.getValue());
        }
    }
}
