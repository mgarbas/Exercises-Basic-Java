package Basic;

import java.util.Scanner;

public class ModuloWithoutModulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the first number");
        int a = scan.nextInt();
        System.out.println("Please input the second number");
        int b = scan.nextInt();
        int devided = a / b;
        int result = a - (devided * b);
        System.out.println(result);
    }
}
