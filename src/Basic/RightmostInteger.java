package Basic;

import java.util.Scanner;

public class RightmostInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the first number");
        int a = scan.nextInt();
        System.out.println("Please input the second number");
        int b = scan.nextInt();
        System.out.println("Please input the third number");
        int c = scan.nextInt();
        System.out.println(test(a,b,c,true));
    }

        public static boolean test (int d, int e, int f, boolean abc) {

        return (d % 10 == e % 10) || (d % 10 == f % 10) || (e % 10 == f % 10);

        }

}
