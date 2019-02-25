package Basic;

import org.apache.commons.lang3.text.WordUtils;

import java.util.Scanner;

public class UpperToLowercase {

    // The program will change block letters to small

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a sentence in block letters");
        String sentence = scan.nextLine();
        String lowercase = WordUtils.swapCase(sentence);
        System.out.println(lowercase);
    }
}
