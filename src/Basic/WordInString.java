package Basic;

public class WordInString {

    public static void main(String[] args) {

        // The program puts a word in the middle of another sentence

        String string = "Two plus two equals four";
        String word = "always";
        System.out.println(string.substring(0,13) + word + string.substring(12));

    }
}
