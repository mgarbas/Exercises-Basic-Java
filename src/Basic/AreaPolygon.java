package Basic;

import java.util.Scanner;

public class AreaPolygon {

    // The program will compute the area of a polygon

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Imput number of sides");
        int a = scan.nextInt();
        System.out.println("Input the lengths of one of the sides");
        int b = scan.nextInt();

        double area = (a * Math.pow(b,2)) / (4 * Math.tan(Math.PI/a));

        System.out.println(area);

    }
}
