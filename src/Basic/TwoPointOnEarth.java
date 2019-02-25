package Basic;

import java.util.Scanner;

public class TwoPointOnEarth{

    // The program will compute the distance between two point on Earth

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the latitude of the first point");
        double a1 = scan.nextDouble();
        System.out.println("Enter the longitude of the first point");
        double a2 = scan.nextDouble();
        System.out.println("Enter the latitude of the second point");
        double b1 = scan.nextDouble();
        System.out.println("Enter the longitude of the second point");
        double b2 = scan.nextDouble();

        double radius = 6371.01;

        double distance = radius * Math.acos(Math.sin(a1)*Math.sin(b1) + Math.cos(a1)*Math.cos(b1)*Math.cos(a2-b2));

        System.out.println("The distance between the two points is "+distance+" km");

    }
}
