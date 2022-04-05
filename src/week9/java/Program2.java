package week9.java;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and English marks
 * (marks is between 0 to 100 and if it is out of range print error message “Invalid Input, Marks should between 0 to 100”)
 * and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 * if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format _____________________________ |
 */
public class Program2 {
    public static void main(String[] args) {
        Program2 obj = new Program2();
        obj.student();
        obj.calculation();
        obj.logic();
    }

    int rollno, maths, science, english, total;
    String name;
    String result = null;
    String grade = null;
    float percentage;

    public void student() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter student roll no: ");
        rollno = sc.nextInt();

        System.out.print("Enter marks for maths: ");
        maths = sc.nextInt();
        while (maths > 100 || maths < 0) {
            System.out.print("Invalid input, Maths marks should be between 0 to 100: ");
            maths = sc.nextInt();
        }
        System.out.print("Enter marks for Science: ");
        science = sc.nextInt();
        while (science > 100 || science < 0) {
            System.out.print("Invalid input, Science marks should be between 0 to 100: ");
            science = sc.nextInt();
        }
        System.out.print("Enter marks for English: ");
        english = sc.nextInt();
        while (english > 100 || english < 0) {
            System.out.print("Invalid input, English marks should be between 0 to 100: ");
            english = sc.nextInt();
        }
    }
       public void calculation(){
           total = maths + science + english;
           percentage = ((total * 100) /300);
            }

       public void logic(){
           if (percentage >= 35) {
               result = "pass";
           } else {
               result = "fail";
           }

           if (percentage >= 80) {
               grade = "A+";
               System.out.println("Grade: " + grade);
           } else if (percentage >= 60 && percentage <= 80) {
               grade = "A";
               System.out.println("Grade: " + grade);
           } else if (percentage >= 50 && percentage <= 60) {
               grade = "B";
               System.out.println("Grade: " + grade);
           } else if (percentage >= 35 && percentage <= 50) {
               grade = "C";
               System.out.println("Grade: " + grade);
           } else {
               grade = "No grade";
           }
           System.out.println("_______________________________________________________________");
           System.out.println("|                       Mark Sheet                            |");
           System.out.println("|_____________________________________________________________|");
           System.out.println("|      Name                         :       " + name + "           |");
           System.out.println("|      Roll No:                     :       " + rollno + "            |");
           System.out.println("|_____________________________________________________________|");
           System.out.println("|      Subjects                     :       Marks             |");
           System.out.println("|_____________________________________________________________|");
           System.out.println("|      Maths                        :       " + maths + "           |");
           System.out.println("|      Science                      :       " + science + "         |");
           System.out.println("|      English                      :       " + english + "         |");
           System.out.println("|_____________________________________________________________|");
           System.out.println("|      Total                        :       " + total + "     |");
           System.out.println("|_____________________________________________________________|");
           System.out.println("|      Percentage                   :       " + total * 100 / 300 + "              |");
           System.out.println("|      Result                       :       " + result + "              |");
           System.out.println("|      Grade                        :       " + grade + "                |");
           System.out.println("|_____________________________________________________________|");

       }
       }



