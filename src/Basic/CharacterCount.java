package Basic;

import java.util.Scanner;

public class CharacterCount {

    public static void main(String[] args) {

        // The program will count different characters in a sentence

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a sentence");
        String string = scan.nextLine();

        char[] chars = string.toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;

        for (int i = 0; i < chars.length;i++) {
            if (Character.isLetter(chars[i])) {
                letter++;
            }else if (Character.isSpaceChar(chars[i])) {
                space++;
            }else if(Character.isDigit(chars[i])) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println("Letters : " + letter);
        System.out.println("Spaces : " + space);
        System.out.println("Numbers : " + number);
        System.out.println("Others : " + other);

    }
}
