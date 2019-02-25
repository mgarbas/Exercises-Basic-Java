package Basic;

import java.util.Scanner;

public class InputTwoThenWork {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = scan.nextInt();
        System.out.println("Please enter the second number");
        int b = scan.nextInt();

        int c = a+b;
        int d = a-b;
        int e = a*b;
        float f = a/b;
        int g = a%b;

        System.out.println(a + " + " + b + " = " +c);
        System.out.println(a + " - " + b + " = " +d);
        System.out.println(a + " x " + b + " = " +e);
        System.out.println(a + " / " + b + " = " +f);
        System.out.println(a + " mod " + b + " = " +g);

    }

}
