package Basic;

import java.util.Scanner;

public class StringToInteger {

    // The program converts string into int

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number(string)");
        String a = scan.nextLine();
        int b = Integer.parseInt(a);
        System.out.println("The interger value is " + b);

    }
}
