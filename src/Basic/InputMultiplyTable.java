package Basic;

import java.util.Scanner;

public class InputMultiplyTable {


    public static void main(String[] args) {

        int[] tab = new int[10];

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scan.nextInt();

        int result;

        for (int i=1; i<=tab.length; i++) {
            result = a*i;
            System.out.println(a + " x " + i + " = " + result);

        }
    }
}
