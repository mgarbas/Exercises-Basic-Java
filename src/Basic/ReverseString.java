package Basic;

public class ReverseString {

    // The program will reverse a given string

    public static void main(String[] args) {

        String abc = "This will be reversed";

        String reversed = new StringBuilder(abc).reverse().toString();

        System.out.println(reversed);
    }
}
