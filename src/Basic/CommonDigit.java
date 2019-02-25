package Basic;

import java.util.Scanner;

public class CommonDigit {

    public static void main(String[] args) {

        // The program check whether the numbers share a digit

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the first number from 25 to 75");
        int a = scan.nextInt();
        System.out.println("Please input the second number from 25 to 75");
        int b = scan.nextInt();

        String first = String.valueOf(a);
        String second = String.valueOf(b);

        char[] tab = first.toCharArray();
        char[] tab2 = second.toCharArray();

        char a1 = tab[0];
        char a2 = tab[1];
        char b1 = tab2[0];
        char b2 = tab2[1];


        if (a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2) {
            System.out.println("The numbers share a digit");
        }else {
            System.out.println("The numbers do not share a digit");
        }

    }
}