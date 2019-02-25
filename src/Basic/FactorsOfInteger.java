package Basic;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorsOfInteger {

    // The program checks the number of factors of any given number

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int a = scan.nextInt();

        IntStream stream = IntStream.range(1,a);

        stream.toArray();

        int counter = 0;

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                counter++;
            }
        }
        System.out.println("The number of factors is: "+counter);

    }
}
