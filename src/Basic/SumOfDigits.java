package Basic;

import java.util.Scanner;

public class SumOfDigits {

    // The program will compute the sum of the individual digits in a number

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scan.nextInt();

        System.out.println("The sum of digits in that number is: "+sum(a));

    }

    public static int sum ( int a) {

        int sum = 0;

        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
