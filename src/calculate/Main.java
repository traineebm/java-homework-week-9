package calculate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main extends Calculator {
    public static void main(String[] args) {
        char s1;
        do {
            System.out.print("Enter first number: ");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();
            System.out.print("Enter the operator you want(+,-, *, /): ");
            s1 = sc.next().charAt(0);
            Main cal = new Main();
            cal.calculateResult(num1,num2, s1);
            System.out.print("Would you like to do more calculation?: ");
             s1 = sc.next().charAt(0);
        } while (s1 =='Y' || s1 == 'y');
    }
    }
