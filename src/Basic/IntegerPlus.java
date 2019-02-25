package Basic;

import java.util.Scanner;

public class IntegerPlus {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scan.nextInt();
        System.out.printf("%d + %d%d + %d%d%d", a, a, a, a, a, a);
    }

}
