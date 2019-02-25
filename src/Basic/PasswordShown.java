package Basic;

import java.util.Scanner;

public class PasswordShown {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String next = scan.nextLine();
        System.out.println("Your password is " + next);


    }
}
