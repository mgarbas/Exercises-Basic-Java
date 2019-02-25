package Basic;

import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class WordReverse {

    // The program will reverse a word

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please input a word");
        String string = scan.nextLine();
        String reversed = StringUtils.reverse(string);
        System.out.println(reversed);

        System.out.println("Please input another word");
        StringBuilder sb = new StringBuilder();
        sb.append(scan.nextLine());
        System.out.println(sb.reverse());

    }
}
