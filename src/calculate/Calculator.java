package calculate;

public class Calculator {

    public void addition(int a, int b){
        System.out.println(a+b);
    }

    public void subtraction(int a, int b){
        System.out.println(a-b);
    }

    public void multiplication(int a, int b){
        System.out.println(a*b);
    }

    public void division(int a, int b){
        System.out.println(a/b);
    }
    public void calculateResult(int a,int b, char ch){
        if (ch == '+') {
            System.out.println( a + b);
        } else if (ch == '-') {
            System.out.println(a - b);
        } else if (ch == '*') {
            System.out.println(a * b);
        } else if (ch == '/') {
            System.out.println(a / b);
        }
        }
        }




