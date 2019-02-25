package Basic;


import java.util.Scanner;

public class SumOfTwoIntegersEqualsThree {

    // The program check whether a sum of two inital numbers equals the third

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the first number");
        int a = scan.nextInt();
        System.out.println("Please input the second number");
        int b = scan.nextInt();
        System.out.println("Please input the third number");
        int c = scan.nextInt();

        boolean test = a + b == c;
        if (test == true) {
            System.out.println("The result is: true");
        }else {
            System.out.println("The result is false");
        }
    }
}
