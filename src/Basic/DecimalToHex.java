package Basic;

import java.util.Scanner;

public class DecimalToHex {

    // The program convert a number into hexadecimal

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();

        System.out.println(Integer.toHexString(a));
    }
}
