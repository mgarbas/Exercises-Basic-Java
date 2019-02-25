package Basic;

import java.util.Scanner;

public class TwoIntegersCompare {

    /* Program accepts two numbers and returns a larger value.
       However, if the numbers are the same the program will return 0,
       and will return the smaller value if the number have the same
       remainder when divided by 6.
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int a = scan.nextInt();
        System.out.println("Please enter the second number");
        int b = scan.nextInt();
        int a1 = a % 6;
        int b1 = b % 6;

        if (a > b) {
            System.out.println("The larger number is: "+a);
        }else if (a < b) {
            System.out.println("The larger number is: "+b);
        }else {
            System.out.println("0");
        }
        if (a1 == b1) {
            if (a > b) {
                System.out.println(b);
            }else if (a < b){
                System.out.println(a);
            }else {
                System.out.println("These number are equal");
            }
        }
    }
}
