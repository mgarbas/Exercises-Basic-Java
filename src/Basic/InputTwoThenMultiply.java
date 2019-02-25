package Basic;

import java.util.Scanner;

public class InputTwoThenMultiply {

    // The program multiplies two numbers

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = scan.nextInt();
        System.out.println("Please enter the second number");
        int b = scan.nextInt();
        System.out.println(a + " x " + b + " = " + a*b);
    }
}