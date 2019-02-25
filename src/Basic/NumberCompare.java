package Basic;

import java.util.Scanner;

public class NumberCompare {

    // The program check if two numbers are equal or which one is bigger

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number");
        int a = scan.nextInt();

        System.out.println("Enter second number");
        int b = scan.nextInt();

        if (a == b) {
            System.out.println(a + " = " + b);
        }else {
            System.out.println(a + " != " + b);
        }
        if (a > b) {
            System.out.println(a + " > " + b);
        }else if (a < b){
            System.out.println(a + " < " + b);
        }else {
            System.out.println(a + " = " + b);
        }
        if (a >= b ) {
            System.out.println(a + " >= " + b);
        }else if (a <= b) {
            System.out.println(a + " <= " + b);
        }
    }
}
