package Basic;

import java.util.Scanner;

public class RightmostInteger2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("This program tests the rightmost interger. If two or more are the same the result will be true");
        System.out.println("Please input the first number");
        int a = scan.nextInt();
        String a1 = String.valueOf(a);
        System.out.println("Please input the second number");
        int b = scan.nextInt();
        String b1 = String.valueOf(b);
        System.out.println("Please input the third number");
        int c = scan.nextInt();
        String c1 = String.valueOf(c);

        char a2 = a1.charAt(a1.length()-1);
        char b2 = b1.charAt(b1.length()-1);
        char c2 = c1.charAt(b1.length()-1);

        if (a2 == b2 || b2 == c2 || a2 == c2) {
            System.out.println("The result is true");
        }else {
            System.out.println("The result is false");
        }

    }
}
