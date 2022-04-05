package week9.java;

// Write a Java program to reverse an array of integer values.
public class ReverseArray {
    public static void main(String[] args) {
        arLength();
    }

    public static void arLength(){
        // Initialising an array
        int a[] = new int[]{1,2,3,4,5,6,7,8};
        System.out.print("Original array: ");
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.print("Array in reverse order: ");
        //Using Loop through the array in reverse order
        for (int i = a.length-1; i >= 0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
