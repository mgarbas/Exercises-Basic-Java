package Basic;

import java.util.Scanner;

public class CheckIfOddorEven {

    // The program checks if a number is even or odd

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a number");
        int a = scan.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
