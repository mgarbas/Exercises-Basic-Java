package Basic;

import java.util.Scanner;

public class AreaHexagon {

    // The program will compute an area of a hexagon

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        double b = (6 * Math.pow(a,2)) / (4 * Math.tan(Math.PI/6));

        System.out.println(b);

    }
}
