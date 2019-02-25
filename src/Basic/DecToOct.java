package Basic;

import java.util.Scanner;

public class DecToOct {

    // The program converts a number into octal

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.println(Integer.toOctalString(a));
    }
}
