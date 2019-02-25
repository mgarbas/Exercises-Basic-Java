package Basic;

import org.apache.commons.lang3.text.WordUtils;

import java.util.Scanner;

public class SmallToCapitalLetters {

    // The program will capitalize the first letter of each word

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a sentence");
        String sentence = scan.nextLine();
        String capital = WordUtils.capitalize(sentence);
        System.out.println(capital);
    }
}
