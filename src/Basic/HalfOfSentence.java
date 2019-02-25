package Basic;

public class HalfOfSentence {

    public static void main(String[] args) {

        // The program cut the sentence in half

        String string = "This sentence will be cut into two halves ";
        String half = string.substring(0,string.length()/2);
        System.out.println(half);
        System.out.println(string.substring(string.length()/2));
    }
}
