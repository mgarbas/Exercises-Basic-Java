package Basic;

import java.util.Scanner;

public class SecondToLastWord {

    // The program outputs a second to lase word in a sentence

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a sentence");
        String sentence = scan.nextLine();
        String[] table = sentence.split(" ");

        System.out.println(table[table.length-2]);

    }
}
