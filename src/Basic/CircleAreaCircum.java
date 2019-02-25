package Basic;

import java.util.Scanner;

public class CircleAreaCircum {

    // The program computes an area and circumference of a circle based on a given radius

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius");
        float a = scan.nextFloat();

        System.out.println(2*Math.PI*a);
        System.out.println(Math.PI*Math.pow(a,2));
    }
}
