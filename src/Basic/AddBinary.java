package Basic;

import java.util.Scanner;

public class AddBinary {

    // The program will convert a number to binary

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();


        System.out.println(Integer.toBinaryString(a));
    }
}
