package Basic;

import java.util.Scanner;
import java.util.stream.IntStream;


public class RangeDivisible {

    public static void main(String[] args) {

        /* The program lists the number of numbers divisible by
           a desired divider within a specified range
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the beginning of the range");
        int a = scan.nextInt();
        System.out.println("Please enter the end of the range");
        int b = scan.nextInt();
        System.out.println("Please enter the divider");
        int c = scan.nextInt();

        IntStream stream = IntStream.range(a,b);

        int[] table = stream.toArray();

        int counter = 0;

        for (int i = 0; i < table.length;i++) {
            if (i % c == 0) {
                counter++;
            }
        }
        System.out.println("The count of numbers divisible by the divider is: "+counter);

    }
}
