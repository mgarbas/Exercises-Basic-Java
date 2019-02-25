package Basic;

import java.util.Scanner;

public class SumOfDigits2 {

    // The program will compute the sum of the individual digits in a number

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scan.nextInt();

        String number = String.valueOf(a);

        int sum = 0;

        for (int i=0;i<number.length();i++) {
            int j = Character.digit(number.charAt(i),10);
            sum += j;

        }
        System.out.println("The sum of digits in that number is: "+sum);
    }
}
